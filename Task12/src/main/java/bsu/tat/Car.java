package bsu.tat;

/**
 * class which has 3 Override methods
 */
public class Car extends Machine implements Movement {
    CountDistance cd = new CountDistance();
    double averageSpeed = 70;
    double consumption = 8;
    double passengers = 2;

    /**
     * @return distance
     */
    @Override
    public double getDistance() {
        return cd.Distance();
    }

    /**
     * @return time
     */
    @Override
    public double getTime() {
        return getDistance() / averageSpeed;
    }

    /**
     * @return cost
     */
    @Override
    double costDistance() {
        double cost = getDistance() / 100 * consumption / passengers;
        return cost;
    }
}
