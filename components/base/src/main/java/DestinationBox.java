import java.util.ArrayList;

public class DestinationBox {

    private String barCode;
    private ArrayList<Baggage> baggegeList;

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public ArrayList<Baggage> getBaggegeList() {
        return baggegeList;
    }

    public void setBaggegeList(ArrayList<Baggage> baggegeList) {
        this.baggegeList = baggegeList;
    }

    @Override
    public String toString() {
        return "DestinationBox{" +
                "barCode='" + barCode + '\'' +
                ", baggegeList=" + baggegeList +
                '}';
    }
}
