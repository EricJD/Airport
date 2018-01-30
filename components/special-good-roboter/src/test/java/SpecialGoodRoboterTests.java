import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialGoodRoboterTests {


    @Test
    public void upTest(){

        boolean expectedDownStatus = false;

        SpecialGoodRoboter robot = new SpecialGoodRoboter("testRobot");

        assertEquals(expectedDownStatus, robot.innerUp());

    }

    @Test
    public void downTest(){

        boolean expectedDownStatus = true;

        SpecialGoodRoboter robot = new SpecialGoodRoboter("testRobot");

        assertEquals(expectedDownStatus, robot.innerDown());

    }

}
