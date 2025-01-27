package tictactoe.models;

public class Board {
    Piece[][] board;
    int size;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean setPieceOnBoard(int row, int col, Piece piece) {
        if (board[row][col] == null) {
            board[row][col] = piece;
            return true;
        } else {
            return false;
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(board[i][j].pieceType + " ");
                }
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }

}
