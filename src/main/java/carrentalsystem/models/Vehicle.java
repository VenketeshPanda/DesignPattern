package carrentalsystem.models;

public class Vehicle {
    String name;
    String numberPlate;
    int kmsDriven;
    VehicleStatus vehicleStatus;
    VehicleType vehicleType;
    public static int vehicleId=1;

    public static int getVehicleId() {
        return vehicleId;
    }

    public static void setVehicleId(int vehicleId) {
        Vehicle.vehicleId = vehicleId;
    }

    public Vehicle(String name, String numberPlate, int kmsDriven, VehicleStatus vehicleStatus, VehicleType vehicleType) {
        this.name = name;
        this.numberPlate = numberPlate;
        this.kmsDriven = kmsDriven;
        this.vehicleStatus = vehicleStatus;
        this.vehicleType = vehicleType;
        vehicleId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getKmsDriven() {
        return kmsDriven;
    }

    public void setKmsDriven(int kmsDriven) {
        this.kmsDriven = kmsDriven;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
