package bsu.tat;

import org.junit.Test;

import static org.junit.Assert.*;


public class WalkerTest {
    Walker wk;

    @Test
    public void getTimePositiveTrue() throws Exception {
        wk = new Walker();
        assertTrue("Time is above zero ", wk.getTime() > 0);
    }

    @Test
    public void getTimePositiveRealTime() throws Exception {
        wk = new Walker();
        assertEquals(769.9510542409821, wk.getTime(), 0.1);
    }

    @Test
    public void getTimeNegativeFalse() throws Exception {
        wk = new Walker();
        assertFalse("Time is less then zero ", wk.getTime() < 0);
    }

    @Test
    public void getTimeNegativeFalseTime() throws Exception {
        wk = new Walker();
        assertNotEquals(0, wk.getTime(), 0.1);
    }
}