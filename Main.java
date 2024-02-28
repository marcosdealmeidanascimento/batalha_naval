import java.util.Random;

import packages.Board;
import packages.Player;
import packages.Ship;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        // Create boards
        Board board1 = new Board();
        Board board2 = new Board();

        // Create players
        Player player1 = new Player("Player 1", board1);
        Player player2 = new Player("Player 2", board2);

        // Create ships 4 ships for each player
        Ship ship1 = new Ship(rand.nextInt(7), rand.nextInt(10));
        Ship ship2 = new Ship(rand.nextInt(7), rand.nextInt(10));
        Ship ship3 = new Ship(rand.nextInt(7), rand.nextInt(10));
        Ship ship4 = new Ship(rand.nextInt(7), rand.nextInt(10));

        // Draw boards
        board1.drawBoard();
        board2.drawBoard();

        // Place ships on boards
        board1.placeShip(ship1);
        board1.placeShip(ship2);
        board2.placeShip(ship3);
        board2.placeShip(ship4);

        while (true) {
            if (player1.attack(player2, rand.nextInt(7), rand.nextInt(10))) {
                System.out.println(player1.getName() + " wins!");
                break;
            }
            if (player2.attack(player1, rand.nextInt(7), rand.nextInt(10))) {
                System.out.println(player2.getName() + " wins!");
                break;
            }
        }

        // Draw boards
        board1.drawBoard();
        board2.drawBoard();

    }
}
