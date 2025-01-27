package tictactoe.winningstrategy;

import tictactoe.models.Piece;

public class CornerWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(int row, int col, Piece piece, Piece[][] board) {
        return false;
    }
}
