package packages;

public class Board {
    private Ship[][] board = new Ship[7][10];

    public Board() {
    }

    public void drawBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null && !board[i][j].isSunk()) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    public void placeShip(Ship ship) {
        if (board[ship.getX()][ship.getY()] != null) {
            throw new IllegalArgumentException("Ship already placed at " + ship.getX() + ", " + ship.getY());
        }
        board[ship.getX()][ship.getY()] = ship;
    }

    public void hit(int x, int y) {
        System.out.println("Attacking " + x + ", " + y);
        if (board[x][y] != null) {
            board[x][y].sinkShip(x, y);
        } else {
            System.out.println("Miss!");
        }
    }

    public boolean isGameOver() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null && !board[i][j].isSunk()) {
                    return false;
                }
            }
        }
        return true;
    }

}
