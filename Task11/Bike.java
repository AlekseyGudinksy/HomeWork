
/**
 *
 */
public class Bike implements Movement {
    public double time() {
        double speed = 25;
        double timeOfBike = getDistance() / speed;
        //System.out.println(timeOfBike);
        return timeOfBike;
    }

    @Override
    public double getTime() {
        return time();
    }
}
