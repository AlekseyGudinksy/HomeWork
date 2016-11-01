package bsu.tat;


import bsu.tat.Route.CheckPoint;


/**
 * Main is a point of entry
 *
 * @author Aleksey Gudinsky
 */
public class Main {
    public static void main(String args[]) {
        CheckPoint chp = new CheckPoint();
        OutPutStatistics os = new OutPutStatistics();
        chp.checkForZeroLength();
        CountDistance cd = new CountDistance();
        System.out.println("Distance = " + cd.Distance());
        os.getStatistics();

    }
}




