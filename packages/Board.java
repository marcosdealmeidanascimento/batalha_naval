package packages;

public class Board {
    private boolean[][] board = new boolean[7][10];
    private boolean[][] listOfHits = new boolean[7][10];
    public Board() {
    }

    public void drawBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void setShip(int x, int y) {
        board[x][y] = true;
    }

    public String hit(int x, int y) {
        if (listOfHits[x][y]) {
            return "You have already hit this spot!";
        }
        if (board[x][y]) {
            board[x][y] = false;
            checkIfAllShipsAreSunk();
            return "Hit! " + x + " " + y;
        }
        checkIfAllShipsAreSunk();
        return "Miss! " + x + " " + y;
    }

    public String checkIfAllShipsAreSunk() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    return "Not all ships are sunk!";
                }
            }
        }
        return "All ships are sunk!" + "\n" + "Game over!";
    }

}
