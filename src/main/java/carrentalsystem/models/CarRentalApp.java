package carrentalsystem.models;

import java.util.ArrayList;
import java.util.List;

public class CarRentalApp {
    List<Location> locationList;
    User user;

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CarRentalApp(){
        locationList = new ArrayList<>();
        user = new User("Venketesh","KA01KSHBF9988");
        setUpLocations();
    }

    private void setUpLocations() {
        locationList.add(new Location(LocationName.BENGALURU));
        locationList.add(new Location(LocationName.DELHI));
        locationList.add(new Location(LocationName.MUMBAI));
    }

    public void displayLocations(){
        for(Location location: locationList){
            System.out.println("Location name: "+location.getLocationName());
        }
        System.out.println("------------------------------------------");
    }

    public Location getLocationByLocationName(LocationName locationName){
        for(Location location: locationList){
            if(location.getLocationName().equals(locationName)){
                return location;
            }
        }
        return null;
    }
}
