public class Invoice {

    private String date;
    private Passenger passenger;
    private int numberOfGoods;
    private int amount;

    public Invoice(String date, Passenger passenger, int numberOfGoods, int amount) {
        this.date = date;
        this.passenger = passenger;
        this.numberOfGoods = numberOfGoods;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(int numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "date='" + date + '\'' +
                ", passenger=" + passenger +
                ", numberOfGoods=" + numberOfGoods +
                ", amount=" + amount +
                '}';
    }
}
