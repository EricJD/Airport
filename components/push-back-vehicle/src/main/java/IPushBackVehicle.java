public interface IPushBackVehicle {

    public void connect(Airplane airplane);

    public void disconnect(Airplane airplane);

    public int forward(int speedInMPH);

    public int backward(int speedInMPH);

    public int turnLeft(int degree);

    public int turnRight(int degree);

    public int stop();

    public boolean up();

    public boolean down();

    public boolean setFlashingLightOn();

    public boolean setFlashingLightOff();

    public boolean setSteeringPin();

    public boolean removeSteeringPin();

}
