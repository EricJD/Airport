public class ContainerProfile {
    private String destination;
    private int numberOfBaggages;

    public ContainerProfile(String destination, int numberOfBaggages) {
        this.destination = destination;
        this.numberOfBaggages = numberOfBaggages;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfBaggages() {
        return numberOfBaggages;
    }

    public void setNumberOfBaggages(int numberOfBaggages) {
        this.numberOfBaggages = numberOfBaggages;
    }

    @Override
    public String toString() {
        return "ContainerProfile{" +
                "destination='" + destination + '\'' +
                ", numberOfBaggages=" + numberOfBaggages +
                '}';
    }
}
