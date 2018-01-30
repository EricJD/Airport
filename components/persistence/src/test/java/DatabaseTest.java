import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DatabaseTest {
    Database database;

    @Before
    public void init() {
        database = new Database();
    }

    @Test
    public void isConnectionOpen() {
        try {
            database.startup(Configuration.instance.dataPath);
            assertFalse(database.getConnection().isClosed());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void isConnectionClosed() {
        try {
            database.startup(Configuration.instance.dataPath);
            database.shutdown();
            assertTrue(database.getConnection().isClosed());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
