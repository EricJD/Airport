import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class FuelPumpTest extends FuelPump{


    @Before
    public void init(){

    }

    @Test
    public void doTestOn(){
        assertEquals(on(), true);
    }

    @Test
    public void doTestOff(){
        assertEquals(off(), false);
    }
}
