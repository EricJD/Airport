public class Baggage{
    private String uuid;
    private String content;
    private double weight;

    public Baggage(String uuid,String content,double weight) {
        this.uuid = uuid;
        this.content = content;
        this.weight = weight;
    }

    public String getUUID() {
        return uuid;
    }

    public String getContent() {
        return content;
    }

    public double getWeight() {
        return weight;
    }

}