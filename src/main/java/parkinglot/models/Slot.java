package parkinglot.models;

public class Slot {
    int slotNo;
    VehicleType vehicleTypeSupported;
    SlotStatus slotStatus;
    Vehicle vehicle;

    public Slot(int slotNo, VehicleType vehicleType) {
        this.slotNo = slotNo;
        this.vehicleTypeSupported = vehicleType;
        slotStatus = SlotStatus.AVAILABLE;
        vehicle = null;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleType().equals(vehicleTypeSupported)) {
            System.out.println("Vehicle parked in slot "+slotNo);
            this.vehicle = vehicle;
            slotStatus = SlotStatus.NOT_AVAILABLE;
        } else {
            System.out.println("NO PARKING!!!");
        }
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public VehicleType getVehicleTypeSupported() {
        return vehicleTypeSupported;
    }

    public void setVehicleTypeSupported(VehicleType vehicleTypeSupported) {
        this.vehicleTypeSupported = vehicleTypeSupported;
    }

    public SlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
