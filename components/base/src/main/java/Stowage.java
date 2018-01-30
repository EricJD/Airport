import java.util.ArrayList;

public class Stowage {

    private ArrayList<Container> containerList;

    public ArrayList<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(ArrayList<Container> containerList) {
        this.containerList = containerList;
    }

    public Stowage(ArrayList<Container> containerList) {
        this.containerList = containerList;
    }

    @Override
    public String toString() {
        return "Stowage{" +
                "containerList=" + containerList +
                '}';
    }
}
