package bsu.tat;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {
    Car cr;

    @Test
    public void getTimePositiveTrue() throws Exception {
        cr = new Car();
        Assert.assertTrue(cr.getTime() > 0, "Time is above zero ");
    }

    @Test
    public void getTimePositiveRealTime() throws Exception {
        cr = new Car();
        Assert.assertEquals(41.42857142857143, cr.getTime(), 0.1);
    }

    @Test
    public void costDistancePositive() throws Exception {
        cr = new Car();
        Assert.assertTrue(cr.costDistance() > 0, "Cost is above zeros ");
    }

    @Test
    public void costDistancePositiveRealDistance() throws Exception {
        cr = new Car();
        Assert.assertEquals(116.0, cr.costDistance(), 0.1);
    }

    @Test
    public void getTimeNegativeFalse() throws Exception {
        cr = new Car();
        Assert.assertFalse(cr.getTime() < 0, "Time is less then zero ");
    }

    @Test
    public void getTimeNegativeFalseTime() throws Exception {
        cr = new Car();
        Assert.assertNotEquals(0, cr.getTime(), 0.1);
    }

    @Test
    public void costDistanceNegative() throws Exception {
        cr = new Car();
        Assert.assertFalse(cr.costDistance() < 0, "Cost is above zeros ");
    }

    @Test
    public void costDistanceNegativeFalseDistance() throws Exception {
        cr = new Car();
        Assert.assertNotEquals(0, cr.costDistance(), 0.1);
    }
}