public class Port implements IBulkyBaggageDesk {

    public static Port instance = new Port();

    private IBulkyBaggageDesk bulkyBaggageDesk;

    private Port() {
        bulkyBaggageDesk = new BulkyBaggageDesk();
    }

    public boolean scan(Passport passport) {
        return bulkyBaggageDesk.scan(passport);
    }

    public boolean scan(BoardingPass boardingPass) {
        return bulkyBaggageDesk.scan(boardingPass);
    }

    public BaggageIdentificationTag checkIn(BoardingPass boardingPass, SpecialGood specialGood) {
        return bulkyBaggageDesk.checkIn(boardingPass, specialGood);
    }

    public void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) {
        bulkyBaggageDesk.notifyGroundOperations(bulkyBaggageDeskReceipt);
    }
}
