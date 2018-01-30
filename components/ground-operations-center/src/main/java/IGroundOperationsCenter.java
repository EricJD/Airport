/**
 * Created by User on 30.01.2018.
 */
public interface IGroundOperationsCenter {
  void receive(CheckInDeskReceipt checkInReceipt);
  void receive(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt);
  void receive(BaggageSortingUnitReceipt baggageSortingUnitReceipt);
  void receive(SecurityCheckReceipt securityCheckReceipt);
  void receive(FederalPoliceReceipt federalPoliceReceipt);
  void receive(CustomsReceipt customsReceipt);
  void receive(ServiceVehicleOilReceipt serviceVehicleOilReceipt);
  void receive(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt);
  void receive(ServiceVehicleNitrogenOxygenReceipt serviceVehicleFreshWaterReceipt);
  void receive(ServiceVehicleWasteWaterTankReceipt serviceVehicleWasteWaterTankReceipt);
  void receive(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);
  void receive(ContainerLifterReceipt containerLifterReceipt);
  void receive(FuelReceipt fuelReceipt);
  void receive(BoardingControlReceipt boardingControlReceipt);
  void receive(PushBackVehicleReceipt pushBackVehicleReceipt);

}
