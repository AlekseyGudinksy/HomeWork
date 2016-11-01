package bsu.tat;

import org.testng.Assert;
import org.testng.annotations.Test;


public class BikeTest {
    Bike bk;

    @Test
    public void getTimePositiveTrue() throws Exception {
        bk = new Bike();
        Assert.assertTrue(bk.getTime() > 0, "Time is above zero ");
    }

    @Test
    public void getTimePositiveRealTime() throws Exception {
        bk = new Bike();
        Assert.assertEquals(131.8181818181818, bk.getTime(), 0.1);
    }

    @Test
    public void getTimeNegativeFalse() throws Exception {
        bk = new Bike();
        Assert.assertFalse(bk.getTime() < 0, "Time is less then zero ");
    }

    @Test
    public void getTimeNegativeFalseTime() throws Exception {
        bk = new Bike();
        Assert.assertNotEquals(0, bk.getTime(), 0.1);
    }
}
