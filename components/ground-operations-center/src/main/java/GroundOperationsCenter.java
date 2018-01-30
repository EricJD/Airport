import java.util.ArrayList;
import SupportClasses.*;

public class GroundOperationsCenter {

    private ArrayList<CheckInDeskReceipt> checkInReceipts = new ArrayList<CheckInDeskReceipt>();
    private ArrayList<BulkyBaggageDeskReceipt> bulkyBaggageDeskReceipts = new ArrayList<BulkyBaggageDeskReceipt>();
    private ArrayList<BaggageSortingUnitReceipt> baggeSortingUnitReceipts = new ArrayList<BaggageSortingUnitReceipt>();
    private ArrayList<SecurityCheckReceipt> securityCheckReceipts = new ArrayList<SecurityCheckReceipt>();
    private ArrayList<FederalPoliceReceipt> federalPoliceReceipts = new ArrayList<FederalPoliceReceipt>();
    private ArrayList<CustomsReceipt> customsReceipts = new ArrayList<CustomsReceipt>();
    private ArrayList<ServiceVehicleOilReceipt> serviceVehicleOilReceipts = new ArrayList<ServiceVehicleOilReceipt>();
    private ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceipts = new ArrayList<ServiceVehicleNitrogenOxygenReceipt>();
    private ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceipts = new ArrayList<ServiceVehicleFreshWaterReceipt>();
    private ArrayList<ServiceVehicleWasteWaterTankReceipt> serviceVehicleWasteWaterTankReceipts = new ArrayList<ServiceVehicleWasteWaterTankReceipt>();
    private ArrayList<AirCargoPalletLifterReceipt> airCargoPalletLifterReceipts = new ArrayList<AirCargoPalletLifterReceipt>();
    private ArrayList<ContainerLifterReceipt> containerLifterReceipts = new ArrayList<ContainerLifterReceipt>();
    private ArrayList<FuelReceipt> fuelReceipts = new ArrayList<FuelReceipt>();
    private ArrayList<BoardingControlReceipt> boardingControlReceipts = new ArrayList<BoardingControlReceipt>();
    private ArrayList<PushBackVehicleReceipt> pushBackVehicleReceipts = new ArrayList<PushBackVehicleReceipt>();

    private static GroundOperationsCenter instance = new GroundOperationsCenter();

    public Port port;

    private GroundOperationsCenter() {
        port = new Port();
    }

    public static GroundOperationsCenter getInstance() {
        return instance;
    }

    public String innerVersion() {
        return "GroundOperationsCenter 0.9";
    }

    public class Port implements IGroundOperationsCenter {
        public String version() {
            return innerVersion();
        }
        public void receive(CheckInDeskReceipt checkInReceipt) { innerCheckInDeskReceipt(checkInReceipt); }

        public void receive(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) { innerBulkyBaggageDeskReceipt(bulkyBaggageDeskReceipt);}

        public void receive(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {innerBaggageSortingUnitReceipt(baggageSortingUnitReceipt); }

        public void receive(SecurityCheckReceipt securityCheckReceipt) { innerSecurityCheckReceipt(securityCheckReceipt); }

        public void receive(FederalPoliceReceipt federalPoliceReceipt) {innerFederalPoliceReceipt(federalPoliceReceipt); }

        public void receive(CustomsReceipt customsReceipt) { innnerCustomsReceipt(customsReceipt); }

        public void receive(ServiceVehicleOilReceipt serviceVehicleOilReceipt) {innerServiceVehicleOilReceipt(serviceVehicleOilReceipt);}

        public void receive(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt) {innerServiceVehicleFreshWaterReceipt(serviceVehicleFreshWaterReceipt); }

        public void receive(ServiceVehicleWasteWaterTankReceipt serviceVehicleWasteWaterTankReceipt) {innerServiceVehicleWasteWaterTankReceipt(serviceVehicleWasteWaterTankReceipt); }

        public void receive(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt) {innerAirCargoPalletLifterReceipt(airCargoPalletLifterReceipt);}

        public void receive(ContainerLifterReceipt containerLifterReceipt) {innerContainerLifterReceipt(containerLifterReceipt);}

        public void receive(FuelReceipt fuelReceipt) {innerFuelReceipt(fuelReceipt);}

        public void receive(BoardingControlReceipt boardingControlReceipt) {innerBoardingControlReceipt(boardingControlReceipt);}

        public void receive(PushBackVehicleReceipt pushBackVehicleReceipt) {innerPushBackVehicleReceipt(pushBackVehicleReceipt);}

        public void receive(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {innerServiceVehicleNitrogenOxygenReceipt(serviceVehicleNitrogenOxygenReceipt); }
    }

    private void innerServiceVehicleNitrogenOxygenReceipt(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {
        serviceVehicleNitrogenOxygenReceipts.add(serviceVehicleNitrogenOxygenReceipt);
    }

    private void innerPushBackVehicleReceipt(PushBackVehicleReceipt pushBackVehicleReceipt) {
        pushBackVehicleReceipts.add(pushBackVehicleReceipt);
    }

    private void innerBoardingControlReceipt(BoardingControlReceipt boardingControlReceipt) {
        boardingControlReceipts.add(boardingControlReceipt);
    }

    private void innerFuelReceipt(FuelReceipt fuelReceipt) {
        fuelReceipts.add(fuelReceipt);
    }

    private void innerContainerLifterReceipt(ContainerLifterReceipt containerLifterReceipt) {
        containerLifterReceipts.add(containerLifterReceipt);
    }

    private void innerAirCargoPalletLifterReceipt(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt) {
        airCargoPalletLifterReceipts.add(airCargoPalletLifterReceipt);
    }

    private void innerServiceVehicleWasteWaterTankReceipt(ServiceVehicleWasteWaterTankReceipt serviceVehicleWasteWaterTankReceipt) {
        serviceVehicleWasteWaterTankReceipts.add(serviceVehicleWasteWaterTankReceipt);
    }

    private void innerServiceVehicleFreshWaterReceipt(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt) {
        serviceVehicleFreshWaterReceipts.add(serviceVehicleFreshWaterReceipt);
    }

    private void innerServiceVehicleOilReceipt(ServiceVehicleOilReceipt serviceVehicleOilReceipt) {
        serviceVehicleOilReceipts.add(serviceVehicleOilReceipt);
    }

    private void innnerCustomsReceipt(CustomsReceipt customsReceipt) {
        customsReceipts.add(customsReceipt);
    }

    private void innerFederalPoliceReceipt(FederalPoliceReceipt federalPoliceReceipt) {
        federalPoliceReceipts.add(federalPoliceReceipt);
    }

    private void innerSecurityCheckReceipt(SecurityCheckReceipt securityCheckReceipt) {
        securityCheckReceipts.add(securityCheckReceipt);
    }

    private void innerBaggageSortingUnitReceipt(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {
        baggeSortingUnitReceipts.add(baggageSortingUnitReceipt);
    }

    private void innerBulkyBaggageDeskReceipt(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) {
        bulkyBaggageDeskReceipts.add(bulkyBaggageDeskReceipt);
    }

    private void innerCheckInDeskReceipt(CheckInDeskReceipt checkInReceipt) {
        checkInReceipts.add(checkInReceipt);
        //factory.persistence.build().insert(CheckInDeskReceipts, checkInReceipt);
    }
}