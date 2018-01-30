public class PassengerList {

    private ArrayList<Passenger> passengerList;

    public PassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    @Override
    public String toString() {
        return "PassengerList{" +
                "passengerList=" + passengerList +
                '}';
    }
}
