package Services;

public class Display {
    private Direction direction;
    private int currentFloor;
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public Direction getDirection() {
        return this.direction;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public int getCurrentFloor() {
        return this.currentFloor;
    }
}
