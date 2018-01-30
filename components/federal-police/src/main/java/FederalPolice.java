import base.*;

import java.util.ArrayList;

public class FederalPolice {

    private static FederalPolice instance = new FederalPolice();

    public Port port;

    private FederalPolice() {
        port = new Port();
        arrestedPassenger = new ArrayList<>();
        baggageList = new ArrayList<>();
        numberOfMunitionInspected = 0;
        numberOfWeaponInspected = 0;
    }

    public static FederalPolice getInstance() {
        return instance;
    }

    private ArrayList<Passenger> arrestedPassenger;
    private ArrayList<Baggage> baggageList;
    private int numberOfWeaponInspected;
    private int numberOfMunitionInspected;

    public class Port implements IFederalPolice {

        @Override
        public boolean verify(Passport passport) {
            return innerMethodVerify(passport);
        }

        @Override
        public boolean scan(Passport passport) {
            return innerMethodScan(passport);
        }

        @Override
        public void arrest(Passenger passenger) {
            innerMethodArrest(passenger);
        }

        @Override
        public boolean inspectWeapon(SpecialGood specialGood) {
            return innerMethodInspectWeapon(specialGood);
        }

        @Override
        public boolean inspectMunition(SpecialGood specialGood) {
            return innerMethodInspectMunition(specialGood);
        }

        @Override
        public void keepSafe(Baggage baggage) {
            innerMethodKeepSafe(baggage);
        }

        @Override
        public void notifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt) {
            innerMethodNotifyGroundOperations(federalPoliceReceipt);
        }
    }

    boolean innerMethodVerify(Passport passport) {
        return passport != null;
    }

    boolean innerMethodScan(Passport passport) {
        return passport != null;
    }

    void innerMethodArrest(Passenger passenger) {
        arrestedPassenger.add(passenger);
    }

    boolean innerMethodInspectWeapon(SpecialGood specialGood) {
        return specialGood.getSpecialGoodType().equals(SpecialGoodType.Weapon);
    }

    boolean innerMethodInspectMunition(SpecialGood specialGood) {
        return specialGood.getSpecialGoodType().equals(SpecialGoodType.Munition);
    }

    void innerMethodKeepSafe(Baggage baggage) {
        baggageList.add(baggage);
    }

    void innerMethodNotifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt) {

    }

}
