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
        CountDistance cd = new CountDistance();

        chp.checkForZeroLength();
        os.getStatistics();
        System.out.println(cd.Distance());
    }
}




