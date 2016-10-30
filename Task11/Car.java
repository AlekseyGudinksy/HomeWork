

/**
 *
 */
public class Car extends Machine implements Movement {
    public double time() {
        double speed = 70;
        double timeOfCar = getDistance() / speed;
        // System.out.println(timeOfCar);
        return timeOfCar;
    }

    @Override
    public double getTime() {
        return time();
    }
}
