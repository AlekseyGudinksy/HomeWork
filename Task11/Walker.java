

import java.util.ArrayList;

/**
 * 
 */
public class Walker implements Movement {
    public double Time() {

        double speed = 6;
        double timeOfWalker = getDistance() / speed;
        return timeOfWalker;
    }

    public double Distance() {
        CheckPoint chp = new CheckPoint();
        double delta1X;
        double delta1Y;
        double distance;
        int counterForDelta1;
        int counterForCountDistance;
        int size = chp.getPoints().size();
        double currentElement = counterForDelta1;
        double nextElement = counterForDelta1 + 1;
        double firstElement = chp.getPoints().get(counterForDelta1).getX();
        double lastElement = size - 1;
        ArrayList<Double> deltaX = new ArrayList<Double>();
        ArrayList<Double> deltaY = new ArrayList<Double>();

        for (counterForDelta1 = 0; counterForDelta1 < chp.getPoints().size(); counterForDelta1++) {
            delta1X = chp.getPoints().get(counterForDelta1 + 1).getX() - chp.getPoints().get(counterForDelta1).getX();
            delta1Y = chp.getPoints().get(counterForDelta1 + 1).getX() - chp.getPoints().get(counterForDelta1).getY();
            deltaX.add(delta1X);
            deltaY.add(delta1Y);
        }

        for (counterForCountDistance = 0; counterForCountDistance <= chp.getPoints().size(); counterForCountDistance++) {
            distance +=;
        }


    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public double getTime() {
        return Time();
    }


}


