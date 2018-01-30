public class BulkyBaggageDesk implements IBulkyBaggageDesk {
    private int id;
    private Employee employee;
    private int numberOfSpecialGoods;

    public boolean scan(Passport passport) {
        return false;
    }

    public boolean scan(BoardingPass boardingPass) {
        return false;
    }

    public BaggageIdentificationTag checkIn(BoardingPass boardingPass, SpecialGood specialGood) {
        return null;
    }

    public void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) {

    }
}
