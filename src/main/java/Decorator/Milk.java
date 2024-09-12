package Decorator;

public class Milk implements AddOns{

    Beverage b;
    Milk(Beverage b){
        this.b=b;
    }


    @Override
    public void getBev() {
        b.getBev();
        System.out.println("Makes your coffee amazing");
    }

    @Override
    public int getCost() {
        return b.getCost() + 10;
    }
}
