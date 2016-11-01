package bsu.tat;

/**
 * class that has 2 Override methods
 */
public class Bike implements Movement {
    CountDistance cd = new CountDistance();
    double averageSpeed = 22;
    double passengers = 0;
    double costByKm = 0;

    /**
     * @return distance which bike passes
     */
    @Override
    public double getDistance() {
        return cd.Distance();
    }

    /**
     * @return time which bike spends to pass the distance
     */
    @Override
    public double getTime() {
        double timeOfBike = getDistance() / averageSpeed;
        return timeOfBike;
    }
}
