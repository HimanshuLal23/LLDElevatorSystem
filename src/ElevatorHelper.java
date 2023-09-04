import Buttons.ExternalButtons;
import Buttons.InternalButtons;
import Services.*;

import java.util.ArrayList;
import java.util.List;

public class ElevatorHelper {
    private InternalButtons internalButtons;
    private Display display;
    private Elevator elevator;
    private ElevatorManager elevatorManager;
    private ExternalButtons externalButtons;
    private List<Floor> floors = new ArrayList<>();
    private Buildings buildings;
    public ElevatorHelper() {
        internalButtons = new InternalButtons();
        display = new Display();
        elevator = new Elevator(internalButtons,1,display);
        elevatorManager = new ElevatorManager(elevator);
        externalButtons = new ExternalButtons();
        buildings = new Buildings(elevatorManager,floors);
    }
    void createFloors() {
        for(int floorId=0;floorId<=10;floorId++) {
            floors.add(new Floor(externalButtons,floorId));
        }
    }
    void execute() throws Exception{
        Elevator elevator1 = elevatorManager.getElevator();
        if(elevator1.getCurrentFloor() == -1) {
            System.out.println("Hey Lift is on basement");
        }else {
            System.out.println("Hey Lift is on " + elevator1.getCurrentFloor());
        }
    }
}
