package factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FederalPoliceFactoryTest {
    private Object componentPort;

    @Test
    public void testBuild() {
        componentPort = FederalPoliceFactory.build();
        assertNotNull(componentPort);
    }
}