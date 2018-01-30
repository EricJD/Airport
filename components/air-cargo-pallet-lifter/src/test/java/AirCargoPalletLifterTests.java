import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirCargoPalletLifterTests {

@Test
    public void upTest(){

        boolean expectedDownStatus = false;

        AirCargoPalletLifter lifter = new AirCargoPalletLifter();

        Assertions.assertEquals(expectedDownStatus, lifter.innerUp());

}

    @Test
    public void downTest(){

        boolean expectedDownStatus = true;

        AirCargoPalletLifter lifter = new AirCargoPalletLifter();

        Assertions.assertEquals(expectedDownStatus, lifter.innerDown());

    }



}
