public class FuelPump {

    private boolean isOn = false;

    public boolean on() { return isOn = true; }

    public boolean off() { return isOn = false; }

    public void pump(int pAmount) {
        AirportFuelTank t = new AirportFuelTank();
        t.takeOut(pAmount);
    }
}
