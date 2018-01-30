import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class BulkyBaggageDeskTest {

    private BulkyBaggageDesk bulkyBaggageDesk;

    private Passenger getPassenger(BoardingPass boardingPass) {
        return new Passenger(
                "Max Mustermann",
                "Test",
                "10.02.1997",
                "Musterstraße 1",
                "71234",
                "Mustercity",
                CitizenshipCode.DEU,
                Gender.Male,
                null,
                new ArrayList<>(),
                boardingPass
        );
    }

    private BoardingPass getBoardingPass() {
        BoardingPass boardingPass = new BoardingPass(
                UUID.randomUUID().toString(),
                Carrier.Lufthansa,
                "testflight",
                null,
                TicketClass.First,
                Source.MUC,
                Destination.JFK,
                "10.02.2018",
                "A51",
                "24:38",
                "01A"
        );

        Passenger passenger = getPassenger(boardingPass);

        boardingPass.setPassenger(passenger);
        Passport passport = new Passport(UUID.randomUUID().toString(), ":-)","N/A", passenger);
        passenger.setPassport(passport);
        return boardingPass;
    }



    private Passport getPassport() {
        BoardingPass boardingPass = getBoardingPass();

        Passenger passenger = getPassenger(boardingPass);

        boardingPass.setPassenger(passenger);
        Passport passport = new Passport(UUID.randomUUID().toString(), ":-)","N/A", passenger);
        passenger.setPassport(passport);
        return passport;
    }

    @Before
    public void setup() {
        bulkyBaggageDesk = new BulkyBaggageDesk();
    }

    @Test
    public void testPassportScan() {
        Passport passport = getPassport();
        assertEquals(true, bulkyBaggageDesk.scan(passport));
    }



    @Test
    public void testBoardingPassScan() {
        BoardingPass boardingPass = getBoardingPass();
        assertEquals(true, bulkyBaggageDesk.scan(boardingPass));
    }


}
