package snakeandladder.models;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Jump[][] board;
    int noOfSnakes;
    int noOfLadders;
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Jump[][] getBoard() {
        return board;
    }

    public void setBoard(Jump[][] board) {
        this.board = board;
    }

    public int getNoOfSnakes() {
        return noOfSnakes;
    }

    public void setNoOfSnakes(int noOfSnakes) {
        this.noOfSnakes = noOfSnakes;
    }

    public int getNoOfLadders() {
        return noOfLadders;
    }

    public void setNoOfLadders(int noOfLadders) {
        this.noOfLadders = noOfLadders;
    }

    public Board(int size, int noOfSnakes, int noOfLadders) {
        this.size=size;
        this.board = new Jump[size][size];
        this.noOfSnakes = noOfSnakes;
        this.noOfLadders = noOfLadders;
        initializeSnakesAndLadders();
    }

    public void initializeSnakesAndLadders() {

        while (noOfSnakes > 0) {
            int snakeStart = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);
            int snakeEnd = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);

            if (snakeEnd >= snakeStart) {
                continue;
            }

            Jump snake = new Jump(snakeStart, snakeEnd);
            markCellAsSnakeOrLadder(snakeStart, snake);

            noOfSnakes--;
        }

        while (noOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, board.length * board.length - 1);

            if (ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladder = new Jump(ladderStart, ladderEnd);
            markCellAsSnakeOrLadder(ladderStart, ladder);

            noOfLadders--;
        }
    }

    public int checkIfSnakeOrLadder(int position) {
        int row = position / board.length;
        int col = position % board.length;

          if (board[row][col] == null) {
            return position;
        } else {
            int endPoint = board[row][col].getEnd();
            if(endPoint>position){
                System.out.println("LADDER");
            } else {
                System.out.println("SNAKE");
            }
            return endPoint;
        }
    }

    public void markCellAsSnakeOrLadder(int position, Jump jump) {
        int row = position / board.length;
        int col = position % board.length;
        if (board[row][col] == null) {
            board[row][col] = jump;
        }
    }
}
