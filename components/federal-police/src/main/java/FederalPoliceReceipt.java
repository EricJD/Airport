import base.Baggage;
import base.Passenger;

import java.util.ArrayList;

public class FederalPoliceReceipt {

    private int numberOfPassportVerified;
    private int numberOfPassengerScanned;
    private ArrayList<Passenger> arrestedPassenger;
    private ArrayList<Baggage> baggageList;

    public FederalPoliceReceipt(int numberOfPassportVerified, int numberOfPassengerScanned, ArrayList<Passenger> arrestedPassenger, ArrayList<Baggage> baggageList) {
        this.numberOfPassportVerified = numberOfPassportVerified;
        this.numberOfPassengerScanned = numberOfPassengerScanned;
        this.arrestedPassenger = arrestedPassenger;
        this.baggageList = baggageList;
    }

    public int getNumberOfPassportVerified() {
        return numberOfPassportVerified;
    }

    public void setNumberOfPassportVerified(int numberOfPassportVerified) {
        this.numberOfPassportVerified = numberOfPassportVerified;
    }

    public int getNumberOfPassengerScanned() {
        return numberOfPassengerScanned;
    }

    public void setNumberOfPassengerScanned(int numberOfPassengerScanned) {
        this.numberOfPassengerScanned = numberOfPassengerScanned;
    }

    public ArrayList<Passenger> getArrestedPassenger() {
        return arrestedPassenger;
    }

    public void setArrestedPassenger(ArrayList<Passenger> arrestedPassenger) {
        this.arrestedPassenger = arrestedPassenger;
    }

    public ArrayList<Baggage> getBaggageList() {
        return baggageList;
    }

    public void setBaggageList(ArrayList<Baggage> baggageList) {
        this.baggageList = baggageList;
    }
}
