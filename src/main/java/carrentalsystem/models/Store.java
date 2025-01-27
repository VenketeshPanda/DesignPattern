package carrentalsystem.models;

import java.util.List;

public class Store {
    VehicleInventory storeVehicleInventory;
    List<Reservation> reservations;
    String storeName;

    public Store(VehicleInventory vehicleInventory,String storeName){
        this.storeVehicleInventory=vehicleInventory;
        this.storeName = storeName;
    }

    public VehicleInventory getStoreVehicleInventory() {
        return storeVehicleInventory;
    }

    public void setStoreVehicleInventory(VehicleInventory storeVehicleInventory) {
        this.storeVehicleInventory = storeVehicleInventory;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
