import java.lang.reflect.Method;
//import Airplane

public class PushBackVehicle {

    private String id;
    private String type;
    private int speedInMPH = 0;
    private int degree = 0;
    private boolean isUp = false;
    private boolean isFlashingLightOn = false;
    private boolean isSteeringPinSet = false;

    private static PushBackVehicle instance = new PushBackVehicle();
    public Port port;

    private PushBackVehicle() {
        port = new Port();
    }

    public static PushBackVehicle getInstance() {
        return instance;
    }

    public class Port implements IPushBackVehicle {
        private Method[] methods = getClass().getMethods();

        public void connect(Airplane airplane) {
            innerMethodConnect(airplane);
        }

        public void disconnect(Airplane airplane){
            innerMethodDisconnect(airplane);
        }

        public int forward(int speedInMPH){
            return innerMethodForward(speedInMPH);
        }

        public int backward(int speedInMPH){
            return innerMethodBackward(speedInMPH);
        }

        public int turnLeft(int degree){
            return innerMethodTurnLeft(degree);
        }

        public int turnRight(int degree){
            return innerMethodTurnRight(degree);
        }

        public int stop(){
            return innerMethodStop();
        }

        public boolean up(){
            return innerMethodUp();
        }

        public boolean down(){
            return innerMethodDown();
        }

        public boolean setFlashingLightOn(){
            return innerMethodSetFlashingLightOn();
        }

        public boolean setFlashingLightOff(){
            return innerMethodSetFlashingLightOff();
        }

        public boolean setSteeringPin(){
            return innerMethodSetSteeringPin();
        }

        public boolean removeSteeringPin(){
            return innerMethodRemoveSteeringPin();
        }
    }

    private void innerMethodConnect(Airplane airplane) {
        System.out.println("Airplane "+ airplane + " connected.");
    }

    private void innerMethodDisconnect(Airplane airplane) {
        System.out.println("Airline " + airplane + " disconnected.");
    }

    private int innerMethodForward(int speedInMPH) {
        return this.speedInMPH = speedInMPH;
    }

    private int innerMethodBackward(int speedInMPH) {
        return this.speedInMPH = speedInMPH;
    }

    private int innerMethodTurnLeft(int degree) {
        return this.degree = degree;
    }

    private int innerMethodTurnRight(int degree) {
        return this.degree = degree;
    }

    private int innerMethodStop() {
        return speedInMPH = 0;
    }

    private boolean innerMethodUp() {
        return isUp = true;
    }

    private boolean innerMethodDown() {
        return isUp = false;
    }

    private boolean innerMethodSetFlashingLightOn() {
        return isFlashingLightOn = true;
    }

    private boolean innerMethodSetFlashingLightOff() {
        return isFlashingLightOn = false;
    }

    private boolean innerMethodSetSteeringPin() {
        return isSteeringPinSet = true;
    }

    private boolean innerMethodRemoveSteeringPin() {
        return isSteeringPinSet = false;
    }
}
