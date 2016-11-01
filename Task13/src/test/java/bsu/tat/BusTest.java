package bsu.tat;

import org.testng.Assert;
import org.testng.annotations.Test;


public class BusTest {
    Bus bs;

    @Test
    public void getTimePositiveTrue() throws Exception {
        bs = new Bus();
        Assert.assertTrue(bs.getTime() > 0, "Time is above zero ");
    }

    @Test
    public void getTimePositiveRealTime() throws Exception {
        bs = new Bus();
        Assert.assertEquals(58.0, bs.getTime(), 0.1);
    }

    @Test
    public void costDistancePositive() throws Exception {
        bs = new Bus();
        Assert.assertTrue(bs.costDistance() > 0, "Cost is above zeros ");
    }

    @Test
    public void costDistancePositiveRealDistance() throws Exception {
        bs = new Bus();
        Assert.assertEquals(34.523809523809526, bs.costDistance(), 0.1);
    }

    @Test
    public void getTimeNegativeFalse() throws Exception {
        bs = new Bus();
        Assert.assertFalse(bs.getTime() < 0, "Time is less then zero ");
    }

    @Test
    public void getTimeNegativeFalseTime() throws Exception {
        bs = new Bus();
        Assert.assertNotEquals(0, bs.getTime(), 0.1);
    }

    @Test
    public void costDistanceNegative() throws Exception {
        bs = new Bus();
        Assert.assertFalse(bs.costDistance() < 0, "Cost is above zeros ");
    }

    @Test
    public void costDistanceNegativeFalseDistance() throws Exception {
        bs = new Bus();
        Assert.assertNotEquals(0, bs.costDistance(), 0.1);
    }
}