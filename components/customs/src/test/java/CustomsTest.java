import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CustomsTest {

    @Test
    void TestGetInstance() {
        Assertions.assertNotNull(Customs.getInstance());
    }

    @Test
    void TestInnerMethodVerify() {
        Assertions.assertFalse(Customs.getInstance().innerMethodVerify(null, null,null ));
    }

    @Test
    void TestInnerMethodScan() {
        Assertions.assertTrue(Customs.getInstance().innerMethodScan(null));
    }

    @Test
    void TestInnerMethodNotifyGroundOperations() {
    }
}