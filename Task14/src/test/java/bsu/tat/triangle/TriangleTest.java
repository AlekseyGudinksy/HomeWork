package bsu.tat.triangle;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


public class TriangleTest {
    private static final String NEGATIVE = "negative";
    private static final String POSITIVE = "positive";
    private static final String ARGUMENT = "argument";
    private static final String SIDE_A = "side_a";
    private static final String SIDE_B = "side_b";
    private static final String SIDE_C = "side_c";


    @DataProvider(name = "positive from xml")
    public Object[][] ReadXMLPositive() throws Exception {
        File inputfile = new File("/Users/alex/IdeaProjects/TriangleNEW/triangle.data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(inputfile);
        NodeList nodes = document.getElementsByTagName(POSITIVE);
        Object[][] result = new Object[nodes.getLength()][];

        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            result[i] = new Double[]{
                    Double.parseDouble(attrs.getNamedItem(ARGUMENT).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_A).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_B).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_C).getNodeValue()),
            };
        }
        return result;
    }

    @Test(dataProvider = "positive from xml")
    public void GetTypePositive(int expected, double a, double b, double c) throws Exception {
        Triangle tr = new Triangle(a, b, c);
        assertEquals(expected, tr.getGetTriangleType());
    }

    @DataProvider(name = "negative from xml")
    public Object[][] ReadXMLNegative() throws Exception {
        File inputfile = new File("/Users/alex/IdeaProjects/TriangleNEW/triangle.data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(inputfile);
        NodeList nodes = document.getElementsByTagName(NEGATIVE);
        Object[][] result = new Object[nodes.getLength()][];

        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            result[i] = new Double[]{

                    Double.parseDouble(attrs.getNamedItem(ARGUMENT).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_A).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_B).getNodeValue()),
                    Double.parseDouble(attrs.getNamedItem(SIDE_C).getNodeValue()),
            };
        }
        return result;
    }

    @Test(dataProvider = "negative from xml")
    public void GetTypeNegative(int expected, double a, double b, double c) throws Exception {
        Triangle tr = new Triangle(a, b, c);
        assertNotEquals(expected, tr.getGetTriangleType());
    }
}