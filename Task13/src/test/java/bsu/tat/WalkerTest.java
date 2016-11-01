package bsu.tat;

import org.testng.*;
import org.testng.annotations.Test;

public class WalkerTest {
    Walker wk;

    @Test
    public void getTimePositiveTrue() throws Exception {
        wk = new Walker();
        Assert.assertTrue(wk.getTime() > 0, "Time is above zero ");
    }

    @Test
    public void getTimePositiveRealTime() throws Exception {
        wk = new Walker();
        Assert.assertEquals(362.5, wk.getTime(), 0.1);
    }

    @Test
    public void getTimeNegativeFalse() throws Exception {
        wk = new Walker();
        Assert.assertFalse(wk.getTime() < 0, "Time is less then zero ");
    }

    @Test
    public void getTimeNegativeFalseTime() throws Exception {
        wk = new Walker();
        Assert.assertNotEquals(0, wk.getTime(), 0.1);
    }
}