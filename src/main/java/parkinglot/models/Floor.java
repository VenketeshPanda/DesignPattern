package parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    int floorNumber;
    List<Slot> slots;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        this.slots = new ArrayList<>();
        setUpSlots();
    }

    private void setUpSlots() {
        slots.add(new Slot(1,VehicleType.CAR));
        slots.add(new Slot(2,VehicleType.CAR));
        slots.add(new Slot(3,VehicleType.CAR));
    }

    public void printAvailableSlots(){
        boolean flag=false;
        for(Slot slot: slots){
            if(slot.getSlotStatus().equals(SlotStatus.AVAILABLE)){
                flag=true;
                System.out.println("Slots id: "+slot.getSlotNo()+" is available for vehicle type: "+ slot.getVehicleTypeSupported());
            }
        }
        if(!flag){
            System.out.println("Sorry, slots in this floor is full!!!");
        }
    }

    public Slot getSlotBySlotNumber(int slotNumber){
        for(Slot slot: slots){
            if(slot.getSlotNo()==slotNumber){
                return slot;
            }
        }
        return null;
    }
}
