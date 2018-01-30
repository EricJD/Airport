public class BoardingPass {

    private String id;
    private Carrier carrier;
    private String flight;
    private Passenger passenger;
    private TicketClass ticketclass;
    private Source source;
    private Destination destination;
    private String date;
    private String gate;
    private String boardingTime;
    private String seat;

    public BoardingPass(String id, Carrier carrier, String flight, Passenger passenger,
                        TicketClass ticketclass, Source source, Destination destination,
                        String date, String gate, String boardingTime, String seat) {
        this.id = id;
        this.carrier = carrier;
        this.flight = flight;
        this.passenger = passenger;
        this.ticketclass = ticketclass;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.gate = gate;
        this.boardingTime = boardingTime;
        this.seat = seat;
    }

    public String getId() {
        return id;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public String getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public TicketClass getTicketclass() {
        return ticketclass;
    }

    public Source getSource() {
        return source;
    }

    public Destination getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public String getGate() {
        return gate;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public String getSeat() {
        return seat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setTicketclass(TicketClass ticketclass) {
        this.ticketclass = ticketclass;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "BoardingPass{" +
                "id='" + id + '\'' +
                ", carrier=" + carrier +
                ", flight='" + flight + '\'' +
                ", passenger=" + passenger +
                ", ticketclass=" + ticketclass +
                ", source=" + source +
                ", destination=" + destination +
                ", date='" + date + '\'' +
                ", gate='" + gate + '\'' +
                ", boardingTime='" + boardingTime + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
