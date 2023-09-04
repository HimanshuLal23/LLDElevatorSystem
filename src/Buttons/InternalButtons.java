package Buttons;

public class InternalButtons {
    boolean floorNumber[] = new boolean[11];
    public void setFloorNumber(int floor){
        floorNumber[floor] = true;
    }
    public boolean[] getFloorNumber() {
        return floorNumber;
    }
}
