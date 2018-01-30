import java.util.ArrayList;

public class AirCargoPalletLifterReceipt {
    Stowage stowage;
    ArrayList<AirCargoPallet> airCargoPalletList;

    public AirCargoPalletLifterReceipt(Stowage stowage, ArrayList<AirCargoPallet> airCargoPalletList) {
        this.stowage = stowage;
        this.airCargoPalletList = airCargoPalletList;
    }

    public Stowage getStowage() {
        return stowage;
    }

    public void setStowage(Stowage stowage) {
        this.stowage = stowage;
    }

    public ArrayList<AirCargoPallet> getAirCargoPalletList() {
        return airCargoPalletList;
    }

    public void setAirCargoPalletList(ArrayList<AirCargoPallet> airCargoPalletList) {
        this.airCargoPalletList = airCargoPalletList;
    }
}
