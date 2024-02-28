package packages;

public class Ship {
    private int x = 0;
    private int y = 0;
    private boolean isSunk = false;

    public Ship(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        if (x < 7 && x >= 0) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("X must be between 0 and 6");
        }
    }

    public void setY(int y) {
        if (y < 10 && y >= 0) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Y must be between 0 and 9");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void sinkShip(int x, int y) {
        if (this.x == x && this.y == y) {
            isSunk = true;
            System.out.println("Hit!");
        } else {
            System.out.println("Miss!");
        }
    }

    public boolean isSunk() {
        return isSunk;
    }

}
