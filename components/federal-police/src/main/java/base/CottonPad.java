package base;

public class CottonPad {
    private String surface;

    public CottonPad(String surface) {
        this.surface = surface;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "CottonPad{" +
                "surface='" + surface + '\'' +
                '}';
    }
}
