public class TreasureHunt {

    private char[][] board;
    private boolean[][] checked;
    private int treasures;
    private int found;
    
    public TreasureHunt(int boardSize) {
        this.board = new char[boardSize][boardSize];
        this.checked = new boolean[boardSize][boardSize];
    }

    public void displayBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean moveIsValid(int row, int col) {
        if (row - 1 > this.board.length || row - 1 < 0) {
            return false;
        } else if (col - 1 > this.board.length || col - 1 < 0) {
            return false;
        } else {
            return true;
        }
    }


    
}
