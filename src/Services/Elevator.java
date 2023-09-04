package Services;

import Buttons.InternalButtons;

public class Elevator {
    private InternalButtons internalButtons;
    private int elevatorId;
    private Display display;
    public Elevator(InternalButtons internalButtons,int elevatorId,Display display) {
        this.internalButtons = internalButtons;
        this.elevatorId = elevatorId;
        this.display = display;
    }
    public int getCurrentFloor() {
        boolean[] floor = internalButtons.getFloorNumber();
        floor[6] = true;
        int floorNumber = -1;
        for(int i=0;i<floor.length;i++) {
            if(floor[i]==true) {
                floorNumber = i+1;
                floor[i] = false;
            }
        }
        return floorNumber;
    }
}
