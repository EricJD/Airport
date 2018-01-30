import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class AirportFuelTankTest extends AirportFuelTank{


    @Before
    public void init(){

    }

    @Test
    public void doFullRefill(){
        assertEquals(refill(), 100000);

    }

    @Test
    public void doPartialRefill(){
        assertEquals(refill(0), 100000);
    }

    @Test
    public void doTakeOut() {
        assertEquals(takeOut(10000), 90000);
    }
}
