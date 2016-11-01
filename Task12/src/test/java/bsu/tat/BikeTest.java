package bsu.tat;

import org.junit.Test;

import static org.junit.Assert.*;

public class BikeTest {
    Bike bk;

    @Test
    public void getTimePositiveTrue() throws Exception {
        bk = new Bike();
        assertTrue("Time is above zero ", bk.getTime() > 0);
    }

    @Test
    public void getTimePositiveRealTime() throws Exception {
        bk = new Bike();
        assertEquals(279.9822015421753, bk.getTime(), 0.1);
    }

    @Test
    public void getTimeNegativeFalse() throws Exception {
        bk = new Bike();
        assertFalse("Time is less then zero ", bk.getTime() < 0);
    }

    @Test
    public void getTimeNegativeFalseTime() throws Exception {
        bk = new Bike();
        assertNotEquals(0, bk.getTime(), 0.1);
    }
}
