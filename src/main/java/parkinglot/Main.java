package parkinglot;

import parkinglot.models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to parking lot");
        Building building = new Building();
        Vehicle vehicle = new Vehicle("KA01KH0099","Maruthi 800", VehicleType.CAR);

        building.printFloorList();
        Floor floor = building.getFloorByFloorNumber(2);
        floor.printAvailableSlots();
        Slot slot = floor.getSlotBySlotNumber(1);

        slot.parkVehicle(vehicle);
        floor.printAvailableSlots();
    }
}
