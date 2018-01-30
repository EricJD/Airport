
import java.util.ArrayList;

public class AirCargoPalletLifter {

    private boolean isDown = true;

    private static AirCargoPalletLifter instance = new AirCargoPalletLifter();

    public Port port;

    public AirCargoPalletLifter() {
        port = new Port();
    }

    public static AirCargoPalletLifter getInstance() {
        return instance;
    }

    public String innerVersion() {
        return "AirCargoPalletLifter XYZ";
    }

    public boolean innerUp(){
        isDown = false;
        return isDown;
    }

    public boolean innerDown(){
        isDown = true;
        return isDown;
    }

    public int innerMove(ArrayList<AirCargoPallet> airCargoPalletList, Stowage stowage){
        int i = 1;
        return i;
    }





    public class Port implements IAirCargoPalletLifter {

        public boolean up(){
            return innerUp();
        }

        public boolean down(){
            return innerDown();
        }

        public int move(ArrayList<AirCargoPallet> airCargoPalletList, Stowage stowage){
            return innerMove(airCargoPalletList, stowage);
        }

        public void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt){

        }










        public String version() {
            return innerVersion();
        }


    }









}