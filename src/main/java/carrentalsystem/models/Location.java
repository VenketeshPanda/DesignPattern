package carrentalsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Location {
    LocationName locationName;
    List<Store> storeList;

    public LocationName getLocationName() {
        return locationName;
    }

    public void setLocationName(LocationName locationName) {
        this.locationName = locationName;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public Location(LocationName locationName){
        this.locationName = locationName;
        this.storeList = new ArrayList<>();

        setUpStoreList();
    }

    private void setUpStoreList() {
        storeList.add(new Store(new VehicleInventory(),"Hello Car lelo"));
        storeList.add(new Store(new VehicleInventory(),"XY?Z Car dekho"));
        storeList.add(new Store(new VehicleInventory(),"ABCSS Car dekho"));
    }

    public void printStoreList(){
        System.out.println("Displaying stores: ");
        for(Store store: storeList){
            System.out.println("Store name: "+store.getStoreName());
        }
    }

    public Store getStoreByName(String name){
        for(Store store: storeList){
            if(store.getStoreName().equals(name)) return store;
        }
        return null;
    }
}
