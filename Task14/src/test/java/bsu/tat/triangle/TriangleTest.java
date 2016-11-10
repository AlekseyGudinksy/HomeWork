package bsu.tat.triangle;

import bsu.tat.triangle.Triangle;

import bsu.tat.triangle.Main.*;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


public class TriangleTest {


//    private static final String NEGATIVE = "negative";
//    private static final String ARGUMENT = "argument";
//    private static final String SIDE_A = "side_a";
//    private static final String SIDE_B = "side_b";
//    private static final String SIDE_C = "side_c";
//
//
//
//    @DataProvider(name = "negative from xml")
//    public Object[][] ReadXML() throws Exception {
//        File inputfile = new File("/Users/alex/IdeaProjects/TriangleNEW/triangle.data.xml");
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//
//        Document document = builder.parse(inputFile);
//        NodeList nodes = document.getElementsByTagName(NEGATIVE);
//        Object[][] result = new Double.[nodes.getLength()][];
//
//        for (int i = 0; i< nodes.getLength(); i++) {
//            NamedNodeMap attrs = nodes.item(i).getAttributes();
//            result[i] = new Double[] {
//
//                    Double.parseDouble(attrs.getNamedItem(ARGUMENT).getNodeValue()),
//                    Double.parseDouble(attrs.getNamedItem(SIDE_A).getNodeValue()),
//                    Double.parseDouble(attrs.getNamedItem(SIDE_B).getNodeValue()),
//                    Double.parseDouble(attrs.getNamedItem(SIDE_C).getNodeValue()),
//            };
//        }
//        return result;
//    }
    
    
    
    @DataProvider(name = "testTypePositive")
    public Object[][] PositiveTest() {
        return new Object[][]{

                {0, 1.2, 2.2, 3.2},

                {2, 2.2, 2.2, 3.2},
                {2, 3.2, 2.2, 2.2},
                {2, 2.2, 3.2, 2.2},

                {3, 2.2, 2.2, 2.2},
        };
    }

    @Test(dataProvider = "testTypePositive")
    public void GetTypePositive(int expected, double a, double b, double c) throws Exception {
        Triangle tr = new Triangle(a, b, c);
        assertEquals(expected, tr.getType());
    }

    @DataProvider(name = "testTypeNegative")
    public Object[][] NegativeTest() {
        return new Object[][]{
                {0, 1.2, 1.2, 3.2},
                {0, 3.2, 1.2, 1.2},
                {0, 1.2, 3.2, 1.2},
                {0, 1.2, 1.2, 1.2},

                {2, 2.2, 2.2, 2.2},
                {2, 1.2, 2.2, 3.2},

                {3, 2.2, 2.2, 3.2},
                {3, 3.2, 2.2, 2.2},
                {3, 2.2, 3.2, 2.2},
                {3, 1.2, 2.2, 3.2},
        };
    }

    @Test(dataProvider = "testTypeNegative")
    public void GetTypeNegative(int expected, double a, double b, double c) throws Exception {
        Triangle tr = new Triangle(a, b, c);
        assertNotEquals(expected, tr.getType());
    }
}