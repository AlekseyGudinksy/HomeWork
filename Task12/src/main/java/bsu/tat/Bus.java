package bsu.tat;

/**
 * class which has 3 Override methods
 */
public class Bus extends Machine implements Movement {
    CountDistance cd = new CountDistance();
    double averageSpeed = 50;
    double consumption = 25;
    double passengers = 21;

    /**
     * @return is distance
     */
    @Override
    public double getDistance() {

        return cd.Distance();
    }

    /**
     * @return is time
     */
    @Override
    public double getTime() {

        return getDistance() / averageSpeed;
    }

    /**
     * @return the price of route for 1 person
     */
    @Override
    double costDistance() {
        double cost = getDistance() / 100 * consumption / passengers;
        return cost;
    }
}
