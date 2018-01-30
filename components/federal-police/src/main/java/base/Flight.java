package base;

import java.util.ArrayList;

public class Flight {
    private String id;
    private Carrier carrier;
    private ArrayList<Passenger> passengerList;
    private Baggage baggageList;

    public Flight(String id, Carrier carrier, ArrayList<Passenger> passengerList, Baggage baggageList) {
        this.id = id;
        this.carrier = carrier;
        this.passengerList = passengerList;
        this.baggageList = baggageList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Baggage getBaggageList() {
        return baggageList;
    }

    public void setBaggageList(Baggage baggageList) {
        this.baggageList = baggageList;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", carrier=" + carrier +
                ", passengerList=" + passengerList +
                ", baggageList=" + baggageList +
                '}';
    }
}
