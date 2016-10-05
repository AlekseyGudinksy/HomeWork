import java.util.Scanner;

/**
 * Finds roots of mean square(RMS) equation.
 */
public class Discriminant {
    /**
     * Method main is point of entry
     * Calls method inputCoefficients
     *
     * @param args command line input arguments
     */
    public static void main(String[] args) {
        inputCoefficients(0, 0, 0);
    }

    /**
     * input coefficients
     * Calls method solvingDiscriminant
     * Checks input for symbols
     *
     * @param a is inputted value of coefficient a
     * @param b is inputted value of coefficient b
     * @param c is inputted value of coefficient c
     */
    public static void inputCoefficients(double a, double b, double c) {
        try {
            // double a, b, c;
            System.out.println("Input coefficient a, b and c:");
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            System.out.println("coefficient a is = " + a);
            System.out.println("coefficient b is = " + b);
            System.out.println("coefficient c is = " + c);
            solvingDiscriminant(a, b, c);
        } catch (Exception e) {
            System.out.println("You inputted symbols, not a number");
        }
    }

    /**
     * Solve Discriminant and checks it for zero value.
     * Finds roots of mean square(RMS) equation.
     * Roots are checked for Nan and Infinite. Output root/s that were found.
     * Output roots of roots of mean square(RMS) equation.
     *
     * @param coefficientA is value of coefficient a
     * @param coefficientB is value of coefficient b
     * @param coefficientC is value of coefficient c
     */
    public static void solvingDiscriminant(double coefficientA, double coefficientB, double coefficientC) {
        double discriminant;
        discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
        if ((Double.isInfinite(1 / discriminant))) {
            System.out.println("discriminant equal to zero");
            double x;
            x = -coefficientB / (2 * coefficientA);

            if (Double.isNaN(x) || (Double.isInfinite(x))) {
                System.out.println("There is no decision");
            } else {
                System.out.println("The equation has only one root: x = " + x);
            }
        }
        if (discriminant > 0) {
            double x1, x2;
            x1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            if (Double.isNaN(x1) || (Double.isInfinite(x1))) {
                System.out.println("There is no decision");
                return;
            }
            x2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
            if (Double.isNaN(x2) || (Double.isInfinite(x2))) {
                System.out.println("There is no decision");
                return;
            }
            System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
        }
        if (discriminant < 0) {
            System.out.println("The equation has no roots");
        }
    }
}











