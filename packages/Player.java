package packages;

public class Player {
    private String name;
    private Board board;

    public Player(String name, Board board) {
        setName(name);
        setBoard(board);
    }

    private void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setBoard(Board board) {
        this.board = board;
    }

    public boolean attack(Player opponent, int x, int y) {
        opponent.board.hit(x, y);
        if (opponent.board.isGameOver()) {
            return true;
        }
        return false;
    }
}
