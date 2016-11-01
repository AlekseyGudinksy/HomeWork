package bsu.tat.Route;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Creating ArrayList 'points' with values of coordinates X and Y
 */
public class CheckPoint {
    private String line;
    String ZERO_ROUTE = "Error: Fist navigation point and last one are the same ";
    private ArrayList<Point> points = ListOfPoints();

    private ArrayList<Point> ListOfPoints() {
        ArrayList<Point> points = new ArrayList<Point>();
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alex/Documents/Route.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                points.add(new Point(Double.parseDouble(data[0]), Double.parseDouble(data[1])));
            }
        } catch (IOException exc) {
            System.out.println("I/O Error" + exc);
        }
        return points;
    }

    /**
     * @return ArrayList is a list of points of fields(x,y)
     */
    public ArrayList<Point> getPoints() {
        return points;
    }

    /**
     * Checks if first coordinate equal to last one.
     */
    public void checkForZeroLength() {
        int size = points.size();
        int firstElement = 0;
        int lastElement = size - 1;
        double x1 = points.get(firstElement).getX();
        double xn = points.get(lastElement).getX();
        double y1 = points.get(firstElement).getY();
        double yn = points.get(lastElement).getY();
        if ((x1 == xn) && (y1 == yn)) {
            System.out.println(ZERO_ROUTE);
        }
    }
}