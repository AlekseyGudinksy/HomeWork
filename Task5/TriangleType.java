import java.util.Scanner;

/**
 * Class which gets input value from user and determines the type of triangle.
 * Sides of triangle are checked for negative and zero values.
 * Sides of triangle are checked for length. Line 27
 * Input values are checked for String expressions.
 */
public class TriangleType {
    /**
     * Method main is point of entry
     *
     * @param args command line input arguments
     */
    public static void main(String[] args) {
        inputCoefficients(0, 0, 0);
    }

    /**
     * Input length of side's
     * Calls method defineTriangle
     * Checks input for symbols
     *
     * @param a is inputted value of length of side a
     * @param b is inputted value of length of side b
     * @param c is inputted value of length of side c
     */
    public static void inputCoefficients(double a, double b, double c) {
        try {
            System.out.println("Input a, b and c:");
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            System.out.println("Length of side a is = " + a);
            System.out.println("Length of side b is = " + b);
            System.out.println("Length of side c is = " + c);
            System.out.println();
            defineTriangle(a, b, c);
        } catch (Exception e) {
            System.out.println("You inputted symbols, not a number");
        }
    }

    /**
     * Sides of triangle are checked for zero and negative values
     * Sides of triangle are checked for length.
     * Determines the type of triangle.
     *
     * @param lengthofsideA
     * @param lengthofsideB
     * @param lengthofsideC
     */
    public static void defineTriangle(double lengthofsideA, double lengthofsideB, double lengthofsideC) {
        if ((Double.isInfinite(1 / lengthofsideA)) || (Double.isInfinite(1 / lengthofsideB)) || (Double.isInfinite(1 / lengthofsideC))) {
            System.out.println("Triangle can't have a side equal to 0");
            return;
        }
        if ((lengthofsideA < 0) || (lengthofsideB < 0) || (lengthofsideC < 0)) {
            System.out.println("Triangle can't have a side less then 0");
            return;
        }
        if (((lengthofsideA + lengthofsideB) < lengthofsideC) || ((lengthofsideA + lengthofsideC) < lengthofsideB) || ((lengthofsideB + lengthofsideC) < lengthofsideA)) {
            System.out.println("Triangle can't have that length of sides");
            return;
        }
        if ((lengthofsideA == lengthofsideB) & (lengthofsideB == lengthofsideC)) {
            System.out.println("Triangle is Equilateral ");
            return;
        } else if ((lengthofsideA == lengthofsideB || (lengthofsideA == lengthofsideC) || (lengthofsideB == lengthofsideC))) {
            System.out.println("Triangle is Isosceles");
        } else {
            System.out.println("Triangle is Usual");
        }
    }
}



