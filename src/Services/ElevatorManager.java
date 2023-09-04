package Services;

public class ElevatorManager {
    private Elevator elevator;
    public ElevatorManager(Elevator elevator) {
        this.elevator = elevator;
    }
    public Elevator getElevator() {
        return elevator;
    }
}
