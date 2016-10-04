import java.util.Scanner;

/**
 * Class which takes coefficient from inputs and finds roots of
 * root mean square(RMS) equation. Inputs are checked for symbols.
 * Roots are checked for Nan and Infinite. Output root/s that were found.
 */
public class Discriminant {
    /**
     * Method main is point of entry
     *
     * @param args command line input arguments
     */
    public static void main(String[] args) {
        try {
            double a, b, c, D;
            System.out.println("Input coefficient a, b and c:");
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                if (Double.isNaN(x1) || (Double.isInfinite(x1))) {
                    System.out.println("There is no decision");
                    return;
                }
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                if (Double.isNaN(x2) || (Double.isInfinite(x2))) {
                    System.out.println("There is no decision");
                    return;
                }
                System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (D == 0) {
                double x;
                x = -b / (2 * a);
                if (Double.isNaN(x) || (Double.isInfinite(x))) {
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
