public class BoardingPass {
    private String id;
    private Carrier carrier;
    private String flight;

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

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }
}
