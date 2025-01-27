package snakeandladder.models;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int noOfDice;

    public Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }

    public int rollDice() {
        int number = noOfDice;
        int count = 0;

        System.out.println("ROLLING DICE>>><<<<");
        while (number > 0) {
            count += ThreadLocalRandom.current().nextInt(1, 6);
            number--;
        }

        return count;
    }
}
