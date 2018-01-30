package base;

public class Container {
    private ContainerType type;
    private String id;
    private ContainerCategory category;
    private ContainerProfile profile;
    private String barCodeIDCategory;
    private String qrCodeIDCategory;
    private int maximumNumberOfBaggages = 50;

    public Container(ContainerType type, String id, ContainerCategory category, ContainerProfile profile, String barCodeIDCategory, String qrCodeIDECategory, int maximumNumberOfBaggages) {
        this.type = type;
        this.id = id;
        this.category = category;
        this.profile = profile;
        this.barCodeIDCategory = barCodeIDCategory;
        this.qrCodeIDCategory = qrCodeIDECategory;
        this.maximumNumberOfBaggages = maximumNumberOfBaggages;
    }

    public ContainerType getType() {
        return type;
    }

    public void setType(ContainerType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContainerCategory getCategory() {
        return category;
    }

    public void setCategory(ContainerCategory category) {
        this.category = category;
    }

    public ContainerProfile getProfile() {
        return profile;
    }

    public void setProfile(ContainerProfile profile) {
        this.profile = profile;
    }

    public String getBarCodeIDCategory() {
        return barCodeIDCategory;
    }

    public void setBarCodeIDCategory(String barCodeIDCategory) {
        this.barCodeIDCategory = barCodeIDCategory;
    }

    public String getQrCodeIDECategory() {
        return qrCodeIDCategory;
    }

    public void setQrCodeIDECategory(String qrCodeIDECategory) {
        this.qrCodeIDCategory = qrCodeIDECategory;
    }

    public int getMaximumNumberOfBaggages() {
        return maximumNumberOfBaggages;
    }

    public void setMaximumNumberOfBaggages(int maximumNumberOfBaggages) {
        this.maximumNumberOfBaggages = maximumNumberOfBaggages;
    }

    @Override
    public String toString() {
        return "Container{" +
                "type=" + type +
                ", id='" + id + '\'' +
                ", category=" + category +
                ", profile=" + profile +
                ", barCodeIDCategory='" + barCodeIDCategory + '\'' +
                ", qrCodeIDECategory='" + qrCodeIDCategory + '\'' +
                ", maximumNumberOfBaggages=" + maximumNumberOfBaggages +
                '}';
    }
}
