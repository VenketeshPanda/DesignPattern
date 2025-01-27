package snakeandladder;

import snakeandladder.models.Board;
import snakeandladder.models.Dice;
import snakeandladder.models.Player;

import java.util.Deque;
import java.util.LinkedList;

public class SnakeAndLadderGame {
    Board board;
    Dice dice;
    Deque<Player> players;
    Player winner;

    public SnakeAndLadderGame(int boardSize, int noOfSnakes, int noOfLadders, int noOfDice) {
        board = new Board(boardSize, noOfSnakes, noOfLadders);
        dice = new Dice(noOfDice);
        players = new LinkedList<>();
        winner = null;
        setUpPlayers();
    }

    public void startGame() {
        while (winner == null) {
            Player playerTurn = getPlayerTurn();
            System.out.println("It's " + playerTurn.getName() + "' turn to roll the dice...");
            System.out.println("Player's current position is: " + playerTurn.getPosition());
            int diceRoll = dice.rollDice();
            System.out.println("Dice rolled to: " + diceRoll);
            int currPosition = playerTurn.getPosition();
            int newPosition = currPosition + diceRoll;
            if (checkWinner(newPosition)) {
                winner = playerTurn;
                break;
            }
            newPosition = board.checkIfSnakeOrLadder(newPosition);
            playerTurn.setPosition(newPosition);
            System.out.println("Player's new position is: " + playerTurn.getPosition());
        }

        System.out.println("The winner is... DRUMROLLLSSSSS");
        System.out.println(winner.getName().toUpperCase());
    }

    private boolean checkWinner(int newPosition) {
        return newPosition >= (board.getSize() * board.getSize());
    }

    private Player getPlayerTurn() {
        Player turnPlayer = players.getFirst();
        players.removeFirst();
        players.addLast(turnPlayer);
        return turnPlayer;
    }


    private void setUpPlayers() {
        players.add(new Player("Venketesh", 0));
        players.add(new Player("Zeerak", 0));
    }
}
