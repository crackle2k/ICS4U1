/*
Authors: Dinesh Sinnathamby, Roy Lu
Date: November 3rd, 2026
Description: The main file to run the Treasure Hunt game, utilising the Treasure Hunt class to handle the gameplay.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            int boardSize = chooseDifficulty(sc);

            TreasureHunt game = new TreasureHunt(boardSize);
            game.startGame(sc);

            System.out.print("\nDo you want to play again? (Y/N): ");
            String answer = sc.nextLine().trim();

            while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
                System.out.print("Invalid choice. Enter Y or N: ");
                answer = sc.nextLine().trim();
            }

            if (answer.equalsIgnoreCase("N")) {
                playing = false;
            }
        }

        System.out.println("Thanks for playing Treasure Quest!");
        sc.close();
    }

    public static int chooseDifficulty(Scanner sc) {
        while (true) {
            System.out.println("\nWhat difficulty do you want to play?");
            System.out.println("[1] Easy (5x5)");
            System.out.println("[2] Medium (7x7)");
            System.out.println("[3] Hard (9x9)");
            System.out.print("Enter your choice: ");

            String answer = sc.nextLine().trim();

            if (answer.equals("1")) {
                return 5;
            } else if (answer.equals("2")) {
                return 7;
            } else if (answer.equals("3")) {
                return 9;
            } else {
                System.out.println("Invalid difficulty. Please try again.");
            }
        }
    }
}
