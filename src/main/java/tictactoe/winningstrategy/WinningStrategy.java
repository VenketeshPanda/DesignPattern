package tictactoe.winningstrategy;

import tictactoe.models.Piece;

public interface WinningStrategy {
    boolean checkWinner(int row, int col, Piece piece,Piece[][] board);
}
