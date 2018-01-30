package base;

public class LuggageTub {

    private Baggage baggage;
    private Destination destination;

    public LuggageTub(Baggage baggage, Destination destination) {
        this.baggage = baggage;
        this.destination = destination;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "LuggageTub{" +
                "baggage=" + baggage +
                ", destination=" + destination +
                '}';
    }
}
