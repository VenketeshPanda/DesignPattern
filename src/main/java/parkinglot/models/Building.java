package parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Floor> floors;

    public Building(){
        this.floors = new ArrayList<>();
        setUpFloors();
    }

    private void setUpFloors() {
        floors.add(new Floor(1));
        floors.add(new Floor(2));
        floors.add(new Floor(3));
    }

    public void printFloorList(){
        for(Floor floor: floors){
            System.out.println("Floor number: "+floor.floorNumber);
        }
    }

    public Floor getFloorByFloorNumber(int number){
        for(Floor floor: floors){
            if(floor.floorNumber == number){
                return floor;
            }
        }
        return null;
    }
}
