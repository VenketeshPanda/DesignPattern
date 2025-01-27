package carrentalsystem.models;

public class Bill {
    int amount;
    Reservation reservation;

    public Bill(int amount,Reservation reservation){
        this.amount=amount;
        this.reservation=reservation;
    }

    public void printBill(){
        reservation.printReservation();
        System.out.println("****************************");
        System.out.println("TOTAL BILL: "+amount);
    }
}
