package tictactoe.models;

public abstract class Piece {
    PieceType pieceType;

    public Piece(PieceType pieceType){
        this.pieceType = pieceType;
    }
}
