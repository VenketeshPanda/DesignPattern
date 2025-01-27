package tictactoe.winningstrategy;

import tictactoe.models.Piece;

public class StandardWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(int row, int col, Piece piece, Piece[][] board) {
        boolean rowCheck = true;
        boolean colCheck = true;
        boolean diagonalCheck = true;
        boolean antiDiagonalCheck = true;

        for(int i=0;i<board.length;i++){
            if(board[i][col]==null || board[i][col]!=piece) colCheck=false;
        }

        for(int i=0;i<board.length;i++){
            if(board[row][i]==null || board[row][i]!=piece)rowCheck=false;
        }

        for(int i=0,j=0;i<board.length;i++,j++){
            if(board[i][j]==null || board[i][j]!=piece) diagonalCheck=false;
        }

        for(int i=0,j=board.length-1;i<board.length;i++,j--){
            if(board[i][j]==null || board[i][j]!=piece) antiDiagonalCheck=false;
        }

        return rowCheck || colCheck || diagonalCheck || antiDiagonalCheck;
    }
}
