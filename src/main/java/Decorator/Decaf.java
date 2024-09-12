package Decorator;

public class Decaf implements Beverage{
    @Override
    public void getBev() {
        System.out.println("DECAFFFF! No caffeine");
    }

    @Override
    public int getCost() {
        return 1000;
    }
}
