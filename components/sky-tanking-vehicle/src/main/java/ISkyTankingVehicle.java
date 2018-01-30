import dummy.FuelTank;

public interface ISkyTankingVehicle {

    boolean connect(FuelPump fuelPump, AirportFuelTank airportFuelTank);
    void pump(FuelTank fuelTank, int amount);
    FuelReceipt print();
    void notifyGroundOperations(FuelReceipt fuelReceipt);

}
