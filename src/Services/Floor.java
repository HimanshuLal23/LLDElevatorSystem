package Services;

import Buttons.ExternalButtons;

public class Floor {
    private ExternalButtons externalButtons;
    private int floorId;

    public Floor(ExternalButtons externalButtons,int floorId) {
        this.externalButtons = externalButtons;
        this.floorId = floorId;
    }

}
