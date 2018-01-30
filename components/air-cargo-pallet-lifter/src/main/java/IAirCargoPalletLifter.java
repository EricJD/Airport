

import java.util.ArrayList;

public interface IAirCargoPalletLifter {
    boolean up();
    boolean down();
    void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);
    int move(ArrayList<AirCargoPallet> airCargoPalletList, Stowage stowage);

    String version();
}