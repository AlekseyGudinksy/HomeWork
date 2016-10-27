

/**
 *
 */
public class Bus extends Machine implements Movement {
    public double time() {
        double speed = 50;

        double timeOfBus = getDistance() / speed;
        //   System.out.println(timeOfBus);
        return timeOfBus;
    }

    @Override
    public double getTime() {
        return time();
    }
}

