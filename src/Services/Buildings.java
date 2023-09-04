package Services;

import java.util.List;

public class Buildings {
    private ElevatorManager elevatorManager;
    private List<Floor> floors;
    public Buildings(ElevatorManager elevatorManager,List<Floor> floors) {
        this.elevatorManager = elevatorManager;
        this.floors = floors;
    }
}
