package bsu.tat;

import bsu.tat.Route.CheckPoint;
import bsu.tat.Route.Point;

import java.util.ArrayList;

/**
 * count distance from all points from arraylist 'point'
 */
public class CountDistance {
    CheckPoint chp = new CheckPoint();
    private double x = 0;

    public double Distance(ArrayList<Point> point) {
//        public double Distance(double X, double Y) {

        double delta1X;
        double delta1Y;
        //double arg1 = this.x - X;

        double distance = 0;
        ArrayList<Double> deltaX = new ArrayList<Double>();
        ArrayList<Double> deltaY = new ArrayList<Double>();

        for (int i = 0; i < chp.getPoints().size() - 1; i++) {
            delta1X = chp.getPoints().get(i + 1).getX() - chp.getPoints().get(i).getX();

            delta1X = point.get(i + 1).getX() - chp.getPoints().get(i).getX();

            delta1Y = chp.getPoints().get(i + 1).getX() - chp.getPoints().get(i).getY();
            deltaX.add(delta1X);
            deltaY.add(delta1Y);
        }

        for (int i = 0; i < chp.getPoints().size() - 1; i++) {
            distance += Math.sqrt(Math.abs(Math.pow((deltaX.get(i)), 2) + Math.pow((deltaY.get(i)), 2)));
        }
        return distance;
    }
}
