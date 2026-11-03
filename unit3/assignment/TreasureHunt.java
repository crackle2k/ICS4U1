/*
Authors: Dinesh Sinnathamby
Date: November 3rd, 2026
Description: The TreasureHunt class file, containing all methods, variables, and logic for the game.
*/

import java.util.*;
import java.io.*;

public class TreasureHunt {

    private char[][] board;
    private boolean[][] checked;
    private int treasures;
    private int found;
    private int lives;
    private int powers;
    private int steps;
    private long lastShuffle;
    private Random random;

    public TreasureHunt(int boardSize) {
        this.board = new char[boardSize][boardSize];
        this.checked = new boolean[boardSize][boardSize];
        this.treasures = 0;
        this.found = 0;
        this.lives = 0;
        this.powers = 0;
        this.steps = 0;
        this.random = new Random();
        initializeBoard();
        this.lastShuffle = System.currentTimeMillis();
    }

    public void initializeBoard() {
        for (int i = 0; i < this.board.length; i++) {
            Arrays.fill(this.board[i], ' ');
            Arrays.fill(this.checked[i], false);
        }

        int minimum = (this.board.length - 3) / 2;
        int mines = minimum + this.random.nextInt(2);
        this.treasures = minimum + this.random.nextInt(2);
        int specials = minimum + this.random.nextInt(2);

        placePieces('*', mines);
        placePieces('$', this.treasures);
        placePieces('T', specials);
    }

    public void placePieces(char piece, int amount) {
        int placed = 0;

        while (placed < amount) {
            int row = this.random.nextInt(this.board.length);
            int col = this.random.nextInt(this.board.length);

            if (this.board[row][col] == ' ') {
                this.board[row][col] = piece;
                placed++;
            }
        }
    }

    public void displayBoard() {
        displayBoard(false, false);
    }

    private void displayBoard(boolean revealAll, boolean showMines) {
        int size = this.board.length;

        for (int i = 0; i < size; i++) {
            System.out.print("  ");
            for (int j = 0; j < size; j++) {
                System.out.print("+---");
            }
            System.out.println("+");

            System.out.printf("%2d", i + 1);

            for (int j = 0; j < size; j++) {
                char symbol = ' ';

                if (revealAll || this.checked[i][j]) {
                    symbol = this.board[i][j] == ' '
                            ? 'X' : this.board[i][j];
                } else if (showMines && this.board[i][j] == '*') {
                    symbol = '*';
                }

                System.out.print("| " + symbol + " ");
            }

            System.out.println("|");
        }

        System.out.print("  ");
        for (int j = 0; j < size; j++) {
            System.out.print("+---");
        }
        System.out.println("+");

        System.out.print("   ");
        for (int j = 1; j <= size; j++) {
            System.out.printf("%-4d", j);
        }
        System.out.println();
    }

    public boolean moveIsValid(int row, int col) {
        if (row < 1 || row > this.board.length) {
            return false;
        } else if (col < 1 || col > this.board.length) {
            return false;
        } else {
            return !this.checked[row - 1][col - 1];
        }
    }

    public int[] getMove(Scanner input) {
        while (true) {
            System.out.print("Enter row and column: ");
            String line = input.nextLine().trim();
            String[] parts = line.split("\\s+");

            if (parts.length != 2) {
                System.out.println("Enter two numbers separated by a space.");
                continue;
            }

            try {
                int row = Integer.parseInt(parts[0]);
                int col = Integer.parseInt(parts[1]);

                if (moveIsValid(row, col)) {
                    return new int[]{row, col};
                }

                System.out.println("Invalid or already revealed tile.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers.");
            }
        }
    }

    public boolean revealTile(int row, int col, Scanner input) {
        row--;
        col--;

        this.checked[row][col] = true;
        this.steps++;

        char piece = this.board[row][col];

        if (piece == '$') {
            this.found++;
            System.out.println("Treasure found!");
            System.out.println("Treasures: " + this.found + "/" + this.treasures);
        } else if (piece == '*') {
            if (this.lives > 0) {
                this.lives--;
                System.out.println("You hit a mine!");
                System.out.println("Extra life used. Lives left: " + this.lives);
            } else {
                System.out.println("You hit a mine!");
                return false;
            }
        } else if (piece == 'T') {
            handleTrickOrTreat();
        } else {
            System.out.println("Empty tile.");
        }

        return true;
    }

    public void handleTrickOrTreat() {
        if (this.random.nextBoolean()) {
            this.lives++;
            System.out.println("Treat! You earned an extra life.");
        } else {
            this.powers++;
            System.out.println("Treat! You earned a Minesweeper power.");
        }
    }

    public boolean useMinesweeperPower(Scanner input) {
        if (this.powers == 0) {
            return false;
        }

        System.out.println("You have " + this.powers + " Minesweeper power(s).");
        System.out.print("Use one now? (Y/N): ");

        String answer = input.nextLine().trim();

        if (answer.equalsIgnoreCase("Y")) {
            this.powers--;
            System.out.println("Mine locations revealed for this turn!");
            return true;
        }

        System.out.println("Power saved for later.");
        return false;
    }

    public void relocateMines() {
        int mines = 0;

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                if (this.board[i][j] == '*'
                        && !this.checked[i][j]) {
                    this.board[i][j] = ' ';
                    mines++;
                }
            }
        }

        ArrayList<int[]> available = new ArrayList<>();

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                if (!this.checked[i][j]
                        && this.board[i][j] == ' ') {
                    available.add(new int[]{i, j});
                }
            }
        }

        Collections.shuffle(available, this.random);

        for (int i = 0; i < Math.min(mines, available.size()); i++) {
            int[] position = available.get(i);
            this.board[position[0]][position[1]] = '*';
        }

        this.lastShuffle = System.currentTimeMillis();
        System.out.println("Hidden mines have been relocated!");
    }

    public boolean checkWin() {
        return this.found == this.treasures;
    }

    public boolean checkDraw() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                if (!this.checked[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public void revealAll() {
        displayBoard(true, false);
    }

    public HashMap<String, Integer> loadScores() {
        HashMap<String, Integer> scores = new HashMap<>();

        try (Scanner file = new Scanner(new File("Winners.txt"))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    try {
                        String name = parts[0].trim();
                        int score = Integer.parseInt(parts[1].trim());

                        if (!name.isEmpty()) {
                            scores.merge(name, score, Math::min);
                        }
                    } catch (NumberFormatException e) {
                        continue;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            return scores;
        }

        return scores;
    }

    public void saveScore(String name) {
        HashMap<String, Integer> scores = loadScores();
        scores.merge(name, this.steps, Math::min);

        try (PrintWriter writer = new PrintWriter("Winners.txt")) {
            for (String player : scores.keySet()) {
                writer.println(player + "," + scores.get(player));
            }

            System.out.println("Score saved!");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to save score.");
        }
    }

    public void displayScores() {
        HashMap<String, Integer> scores = loadScores();

        System.out.println("\n--- Previous Winners ---");

        if (scores.isEmpty()) {
            System.out.println("No winners recorded yet.");
            return;
        }

        ArrayList<String> names = new ArrayList<>(scores.keySet());

        names.sort(Comparator.comparingInt(scores::get));

        for (String name : names) {
            System.out.println(name + ": " + scores.get(name)
                    + " steps");
        }
    }

    public void startGame(Scanner input) {
        displayScores();

        boolean alive = true;

        while (alive && !checkWin() && !checkDraw()) {
            if (System.currentTimeMillis() - this.lastShuffle
                    >= 60000) {
                relocateMines();
            }

            boolean showMines = false;

            if (this.powers > 0) {
                showMines = useMinesweeperPower(input);
            }

            System.out.println("\nTreasures: " + this.found
                    + "/" + this.treasures);
            System.out.println("Extra lives: " + this.lives);
            System.out.println("Steps: " + this.steps);

            displayBoard(false, showMines);

            int[] move = getMove(input);

            if (System.currentTimeMillis() - this.lastShuffle
                    >= 60000) {
                relocateMines();
                System.out.println("The mine locations may have changed.");
            }

            alive = revealTile(move[0], move[1], input);
        }

        System.out.println("\n--- Final Board ---");
        revealAll();

        if (checkWin()) {
            System.out.println("Congratulations! You won!");
            System.out.println("Final score: " + this.steps + " steps");

            System.out.print("Enter your name: ");
            String name = input.nextLine().trim()
                    .replace(",", "");

            if (name.isEmpty()) {
                name = "Anonymous";
            }

            saveScore(name);
        } else if (!alive) {
            System.out.println("Game Over! You lost.");
            System.out.println("Steps taken: " + this.steps);
        } else {
            System.out.println("Stalemate! No moves remaining.");
            System.out.println("Steps taken: " + this.steps);
        }
    }
}
