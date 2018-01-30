package base;

public class SpecialGood {
    private SpecialGoodType specialGoodType;

    public SpecialGood(SpecialGoodType specialGoodType) {
        this.specialGoodType = specialGoodType;
    }

    public SpecialGoodType getSpecialGoodType() {
        return specialGoodType;
    }

    public void setSpecialGoodType(SpecialGoodType specialGoodType) {
        this.specialGoodType = specialGoodType;
    }

    @Override
    public String toString() {
        return "base.SpecialGood{" +
                "specialGoodType=" + specialGoodType +
                '}';
    }
}
