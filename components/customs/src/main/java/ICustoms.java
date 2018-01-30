public interface ICustoms {
    public boolean verify(Passport passport, BoardingPass boardingPass, Invoice parameter);
    public boolean scan(Baggage baggage);
    public void notifyGroundOperations(CustomsReceipt customsReceipt);
}
