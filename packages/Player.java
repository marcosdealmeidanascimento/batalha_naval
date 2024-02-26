package packages;

public class Player {
    private String name;
    private Board board;

    public Player(String name, Board board){
        setName(name);
        this.board = new Board();
    }

    private void setShip(int x, int y) {
        board.setShip(x, y);
    }

    private String hit(int x, int y) {
        return board.hit(x, y);
    }

    private void setName(String name) {
        
    }
}
