package Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage houseBlend = new Decaf();
        houseBlend = new Milk(houseBlend); 
        houseBlend = new Milk(houseBlend);
        houseBlend.getBev();
        System.out.println("Total amount: "+houseBlend.getCost());
//        houseBlend.getCost();
//        System.out.println(houseBlend.getBev());
    }
}
