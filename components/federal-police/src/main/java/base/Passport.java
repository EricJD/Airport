package base;

public class Passport {
    private String id;
    private String picture;
    private String visa = "N/A";
    private Passenger passenger;

    public Passport(String id, String picture, String visa, Passenger passenger) {
        this.id = id;
        this.picture = picture;
        this.visa = visa;
        this.passenger = passenger;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", picture='" + picture + '\'' +
                ", visa='" + visa + '\'' +
                ", passenger=" + passenger +
                '}';
    }
}
