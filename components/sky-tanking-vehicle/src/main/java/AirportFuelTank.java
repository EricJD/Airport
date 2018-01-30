public class AirportFuelTank {
    private int amount = 100000;

    public int takeOut(int pAmount) {
        if(pAmount > amount)
            return 0;
        else {
            amount -= pAmount;
            return amount;
        }
    }

    public int refill() {
        amount = 100000;
        return amount;
    }

    public int refill(int pAmount) {
        if(amount+pAmount<100000) {
            amount += pAmount;
            return amount;
        }
        return amount;
    }
}
