package snakeandladder;

public class Main {
    public static void main(String[] args) {
        System.out.println("..WELCOME TO SNAKES AND LADDERS..");
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame(10,8,9,1);
        snakeAndLadderGame.startGame();
    }
}
