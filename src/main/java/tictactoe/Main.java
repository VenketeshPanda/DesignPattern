package tictactoe;

import tictactoe.models.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        TicTacToeGame ticTacToeGame = new TicTacToeGame(3);
        ticTacToeGame.startGame();
    }
}
