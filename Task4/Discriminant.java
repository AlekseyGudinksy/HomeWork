import java.util.Scanner;

/**
 * Class which takes coefficient from inputs and finds roots of
 * root mean square(RMS) equation. Inputs are checked for symbols, if there is
 * only one root, it checked for a NaN. Output root/s that were found.
 */
public class Discriminant {
    /**
     * Method main is point of entry
     *
     * @param args command line input arguments
     */
    public static void main(String[] args) {
        try {
            double a, b, c;
            double D;
            System.out.println("Input coefficient a, b and c:");
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            if (a == 0) {
                System.out.println("Coefficient 'a' can't be zero");
            }
            D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (D == 0) {
                double x;
                x = -b / (2 * a);
                if (Double.isNaN(x)) {
                    System.out.println("There is no decision");
                } else {
                    System.out.println("The equation has only one root: x = " + x);
                }
            } else {
                System.out.println("The equation has no roots");
            }
        } catch (Exception e) {
            System.out.println("You inputted symbols, not a number");
        }
    }
}
