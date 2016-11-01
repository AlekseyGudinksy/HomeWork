package bsu.tat;

/**
 * output statistics that consist of time
 * and cost my one passanger
 */
public class OutPutStatistics {
    public void getStatistics() {
        Bike bk = new Bike();
        Walker wl = new Walker();
        Car cr = new Car();
        Bus bs = new Bus();
        System.out.println("Time for bike is: " + bk.getTime() + " h.");
        System.out.println("Time for walker is: " + wl.getTime() + " h.");
        System.out.println("Time for car is: " + cr.getTime() + " h." + " Cost  is: " + cr.costDistance() + " l.");
        System.out.println("Time for bus is: " + bs.getTime() + " h." + " Cost is: " + bs.costDistance() + " l.");
    }
}
