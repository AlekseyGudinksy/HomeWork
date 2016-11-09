package bsu.tat.triangle;

import org.junit.Assert;
import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class TriangleCheckTest {
    TriangleCheck tch;

    @Test
    public void testZeroValidator() throws Exception {
        tch = new TriangleCheck();
    }

    @Test
    public void testNegativeValidator() throws Exception {
    }

    @Test
    public void testExistValidator() throws Exception {
    }

}