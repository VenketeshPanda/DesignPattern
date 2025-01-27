package carrentalsystem.models;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehiclesInInventory;

    public VehicleInventory(){
        vehiclesInInventory = new ArrayList<>();
        setUpVehicles();
    }

    public List<Vehicle> getVehiclesInInventory() {
        return vehiclesInInventory;
    }

    public void setVehiclesInInventory(List<Vehicle> vehiclesInInventory) {
        this.vehiclesInInventory = vehiclesInInventory;
    }

    private void setUpVehicles() {
        vehiclesInInventory.add(new Vehicle("Maruti 800","KA01Kh4455",5000, VehicleStatus.AVAILABLE,VehicleType.CAR));
        vehiclesInInventory.add(new Vehicle("Tata tiago","KA012233H",9000,VehicleStatus.AVAILABLE,VehicleType.CAR));
        vehiclesInInventory.add(new Vehicle("Audi x8","MH0SS8899",2000,VehicleStatus.NOT_AVAILABLE,VehicleType.CAR));
    }

    public void printVehicles(){
        System.out.println("Here are the available vehicles: ");
        for(Vehicle vehicle: vehiclesInInventory){
            if(vehicle.getVehicleStatus().equals(VehicleStatus.AVAILABLE)){
                System.out.println("VehicleID: "+vehicle.getName());
                System.out.println("Vehicle: "+vehicle.getName());
                System.out.println("Number: "+vehicle.getNumberPlate());
                System.out.println("Kms driven: "+vehicle.getKmsDriven());
                System.out.println("--------------------------------------");
            }
        }
    }

    public void markVehicleAsUnavailable(Vehicle vehicle){
        for(Vehicle vehicleInInventory: vehiclesInInventory){
            if(Vehicle.getVehicleId()== Vehicle.getVehicleId()){
                System.out.println("Marking "+vehicle.getNumberPlate()+" as not available");
                vehicleInInventory.setVehicleStatus(VehicleStatus.NOT_AVAILABLE);
                break;
            }
        }
    }

    public Vehicle getVehicleByName(String vehicleName){
        for(Vehicle vehicle: vehiclesInInventory){
            if(vehicle.getName().equals(vehicleName)) return vehicle;
        }
        return null;
    }
}
