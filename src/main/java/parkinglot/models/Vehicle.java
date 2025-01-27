package parkinglot.models;

public class Vehicle {
    String vehicleNo;
    String name;
    VehicleType vehicleType;

    public Vehicle(String vehicleNo, String name, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.name = name;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
