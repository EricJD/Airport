package main;

public class SkyTankingVehicle {
    private static SkyTankingVehicle instance = new SkyTankingVehicle();
    public Port port;
    private SkyTankingVehicle() { port = new Port();}
    public static SkyTankingVehicle getInstance() {return instance;}

    private boolean isConnected = false;
    private FuelPump fuelPump;
    private int totalAmount;

    public class Port implements ISkyTankingVehicle {

        public boolean connect(FuelPump fuelPump, AirportFuelTank airportFuelTank) {
            return innerMethodConnect(fuelPump, airportFuelTank);
        }

        public void pump(FuelTank fuelTank, int amount) {
            innerMethodPump(fuelTank, amount);
        }

        public FuelReceipt print() {
            return innerMethodPrint();
        }

        public void notifyGroundOperations(FuelReceipt fuelReceipt) {
            innerMethodNotifyGroundOperations(fuelReceipt);
        }
    }

    //Logic

    private boolean innerMethodConnect(FuelPump pFuelPump, AirportFuelTank pAirportFuelTank) {
        fuelPump = pFuelPump;
        AirportFuelTank airportFuelTank = new AirportFuelTank();
        airportFuelTank = pAirportFuelTank;

        isConnected = true;
        return isConnected;
    }

    private void innerMethodPump(FuelTank fuelTank, int amount) {
        fuelTank.refill(amount);

    }

    private FuelReceipt innerMethodPrint() {
        FuelReceipt receipt = new FuelReceipt();
        System.out.println("---main.FuelReceipt---");
        System.out.println("Date: " + receipt.getDate_time());
        System.out.println("Flight: " + receipt.getFlight());
        System.out.println("Amount: " + receipt.getTotalAmount());
        return receipt;
    }

    private void innerMethodNotifyGroundOperations(FuelReceipt fuelReceipt) {

    }
}
