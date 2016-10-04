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
        try {
            double a, b, c;
            System.out.println("Input length of triangle side's");
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            if ((a <= 0) || (b <= 0) || (c <= 0)) {
                System.out.println("Triangle can't have a side less then 0 or equal it");
                return;
            }
            if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
                System.out.println("Triangle can't have that length of sides");
                return;
            }
            if ((a == b) & (b == c)) {
                System.out.println("Triangle is Equilateral ");
                return;
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Triangle is Isosceles");
            } else {
                System.out.println("Triangle is Usual");
            }
        } catch (Exception e) {
            System.out.println("You inputted symbols, not a number");
        }
    }
}

