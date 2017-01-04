package bsu.tat.calculator;

/**
 * Computing like:
 * Sum of two numbers
 * Difference of two numbers
 * Composition of two numbers
 * Private of two numbers
 *
 * @author Alexey Gudinsky
 */
public class Computation {


    private double sum;
    private double difference;
    private double composition;
    private double privat;
    private double nmbr1;
    private double nmbr2;
    private final String DIVIDED_BY_ZERO = "ERROR: You can't divide by zero,"
            + " please input a nonzero second number. "
            + " Private accept the default value. Private is zero.";

    Computation(double number1, double number2) {
        nmbr1 = number1;
        nmbr2 = number2;
    }

    /**
     * Count sum of two numbers
     *
     * @return sum of two numbers
     */
    private double Sum() {
        sum = this.nmbr1 + this.nmbr2;
        return sum;
    }

    /**
     * Count difference of two numbers
     *
     * @return difference of two numbers
     */
    private double Difference() {
        difference = this.nmbr1 - this.nmbr2;
        return difference;
    }

    /**
     * Count composition of two numbers
     *
     * @return composition of two numbers
     */
    private double Composition() {
        composition = this.nmbr1 * this.nmbr2;
        return composition;
    }

    /**
     * Count private of two numbers
     *
     * @return private of two numbers
     */
    private double Private() {
        if (!Double.isInfinite((1) / this.nmbr2)) {
            privat = this.nmbr1 / this.nmbr2;
        } else {
            System.out.println(DIVIDED_BY_ZERO);
        }
        return privat;
    }

    public double getSum() {
        return Sum();
    }

    public double getDifference() {
        return Difference();
    }

    public double getComposition() {
        return Composition();
    }

    public double getPrivat() {
        return Private();
    }
}
