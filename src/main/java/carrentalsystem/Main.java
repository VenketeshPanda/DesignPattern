package carrentalsystem;

import carrentalsystem.models.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to car rental system");
        CarRentalApp carRentalApp = new CarRentalApp();

        //Displaying locations
        System.out.println("Displaying the locations we are operating: ");
        carRentalApp.displayLocations();
        System.out.println("-----------------------------------------");

        //Displaying stores by selected locations
        Location location = carRentalApp.getLocationByLocationName(LocationName.BENGALURU);
        location.printStoreList();

        //Displaying inventory of the particular store
        Store store = location.getStoreByName("Hello Car lelo");
        store.getStoreVehicleInventory().printVehicles();

        //Selecting vehicle and marking it not available
        Vehicle vehicle = store.getStoreVehicleInventory().getVehicleByName("Tata tiago");
        store.getStoreVehicleInventory().markVehicleAsUnavailable(vehicle);
        System.out.println("------------------------------------------");
        store.getStoreVehicleInventory().printVehicles();

        //Getting the reservations
        Reservation reservation = new Reservation(vehicle,carRentalApp.getUser(), LocalDateTime.MAX,LocalDateTime.MIN);

        //Generating the bill
        Bill bill = new Bill(20000,reservation);
        bill.printBill();

        //Doing the payment
        Payment payment = new Payment(bill);
        payment.payBill();

        System.out.println("HEY, YOU CAN COLLECT YOUR VEHICLE NOW!!!");
    }
}
