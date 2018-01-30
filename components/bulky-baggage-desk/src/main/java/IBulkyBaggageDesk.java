public interface IBulkyBaggageDesk {
    boolean scan(Passport passport);
    boolean scan(BoardingPass boardingPass);
    BaggageIdentificationTag checkIn(BoardingPass boardingPass, SpecialGood specialGood);
    void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt);
}
