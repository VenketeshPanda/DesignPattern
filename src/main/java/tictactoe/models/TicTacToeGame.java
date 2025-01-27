package tictactoe.models;

import tictactoe.winningstrategy.WinningStrategy;
import tictactoe.winningstrategy.WinningStrategyFactory;
import tictactoe.winningstrategy.WinningStrategyType;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Board board;
    Deque<Player> players;
    Player winner;
    WinningStrategy winningStrategy;

    public TicTacToeGame(int size) {
        board = new Board(size);
        winner = null;
        players = new LinkedList<>();
        this.winningStrategy = WinningStrategyFactory.getWinningStrategy(WinningStrategyType.STANDARD);
        setUpPlayers();
    }

    public void startGame() {
        boolean isWinner = true;
        int count = 0;

        while (winner == null) {
            count++;
            board.printBoard();
            Player currPlayer = getNextPlayer();
            System.out.println("Its " + currPlayer.getName() + "'s turn and his symbol is:  " + currPlayer.getPiece().pieceType);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter row: ");
            int row = scanner.nextInt();
            System.out.println("Enter col: ");
            int col = scanner.nextInt();

            if (!board.setPieceOnBoard(row, col, currPlayer.piece)) {
                count--;
                System.out.println("Retry since you played on the wrong cell...");
                players.removeLast();
                players.addFirst(currPlayer);
                continue;
            }

            if (winningStrategy.checkWinner(row, col, currPlayer.piece, board.getBoard())) {
                winner = currPlayer;
                break;
            }

            if (count >= board.getSize() * board.getSize()) {
                isWinner = false;
                break;
            }
        }
        board.printBoard();
        if (isWinner == false) {
            System.out.println("Game ended in a draw");
        } else {
            System.out.println("The winner is.... DRUMROLLLSSSS");
            System.out.println(winner.getName());
        }
    }

    private Player getNextPlayer() {
        Player player = players.getFirst();
        players.removeFirst();
        players.addLast(player);
        return player;
    }

    private void setUpPlayers() {
        players.add(new Player("Venky", new PieceX()));
        players.add(new Player("Zeerak", new PieceO()));
    }
}
