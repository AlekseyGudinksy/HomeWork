package bsu.tat;

import org.junit.Test;

import static org.junit.Assert.*;


public class BusTest {
    Bus bs;

    @Test
    public void getTimePositiveTrue() throws Exception {
        bs = new Bus();
        assertTrue("Time is above zero ", bs.getTime() > 0);
    }

    @Test
    public void getTimePositiveRealTime() throws Exception {
        bs = new Bus();
        assertEquals(123.19216867855714, bs.getTime(), 0.1);
    }

    @Test
    public void costDistancePositive() throws Exception {
        bs = new Bus();
        assertTrue("Cost is above zeros ", bs.costDistance() > 0);
    }

    @Test
    public void costDistancePositiveRealDistance() throws Exception {
        bs = new Bus();
        assertEquals(73.32867183247448, bs.costDistance(), 0.1);
    }

    @Test
    public void getTimeNegativeFalse() throws Exception {
        bs = new Bus();
        assertFalse("Time is less then zero ", bs.getTime() < 0);
    }

    @Test
    public void getTimeNegativeFalseTime() throws Exception {
        bs = new Bus();
        assertNotEquals(0, bs.getTime(), 0.1);
    }

    @Test
    public void costDistanceNegative() throws Exception {
        bs = new Bus();
        assertFalse("Cost is above zeros ", bs.costDistance() < 0);
    }

    @Test
    public void costDistanceNegativeFalseDistance() throws Exception {
        bs = new Bus();
        assertNotEquals(0, bs.costDistance(), 0.1);
    }


}