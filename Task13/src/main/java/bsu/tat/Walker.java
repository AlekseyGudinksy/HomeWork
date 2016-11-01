package bsu.tat;


/**
 * Class which return Distance and Time
 */
public class Walker implements Movement {
    CountDistance cd = new CountDistance();
    double averageSpeed = 8;
    double passengers = 0;
    double costByKm = 0;

    /**
     * @return is distance which walker passes
     */
    @Override
    public double getDistance() {
        return cd.Distance();
    }

    /**
     * @return is time which walker spends to pass the distance
     */
    @Override
    public double getTime() {
        double timeOfWalker = getDistance() / averageSpeed;
        return timeOfWalker;
    }
}



