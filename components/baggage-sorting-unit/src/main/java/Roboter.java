import placeholder.BaggageIdentificationTag;
import placeholder.BaggageVehicle;
import placeholder.Container;

import java.util.ArrayList;

public class Roboter {

    public Roboter(){}

    public void load(ArrayList<BaggageIdentificationTag> baggageIdentificationTagList, Container container){
        // TODO: Wie soll das in den Container? wegschmeißen?
    }

    public void load(Container container, BaggageVehicle baggageVehicle) {
        baggageVehicle.store(container);
    }

    public void orderBaggageVehicleMove( BaggageVehicle baggageVehicle, String position) {
        // TODO: Wie bewegen? Per Event?
    }
}
