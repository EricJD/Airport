import dummy.FuelTank;
//Dummy imports remove for complete build

public class SkyTankingVehicle {
    private static SkyTankingVehicle instance = new SkyTankingVehicle();
    public Port port;
    private SkyTankingVehicle() { port = new Port();}
    public static SkyTankingVehicle getInstance() {return instance;}

    private boolean isConnected = false;
    private FuelPump fuelPump = new FuelPump();
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

    public boolean innerMethodConnect(FuelPump pFuelPump, AirportFuelTank pAirportFuelTank) {
        fuelPump = pFuelPump;
        AirportFuelTank airportFuelTank = new AirportFuelTank();
        airportFuelTank = pAirportFuelTank;

        isConnected = true;
        return isConnected;
    }

    public void innerMethodPump(FuelTank fuelTank, int amount) {
        fuelPump.pump(amount);
        fuelTank.refill(amount);

    }

    public FuelReceipt innerMethodPrint() {
        FuelReceipt receipt = new FuelReceipt();
        System.out.println("---main.FuelReceipt---");
        System.out.println("Date: " + receipt.getDate_time());
        System.out.println("Flight: " + receipt.getFlight());
        System.out.println("Amount: " + receipt.getTotalAmount());
        return receipt;
    }

    public void innerMethodNotifyGroundOperations(FuelReceipt fuelReceipt) {
        //GroundOperationsCenter groundOperationsCenter = new GroundOperationsCenter();
        //groundOperationsCenter.recieve(fuelReceipt);
    }
}
