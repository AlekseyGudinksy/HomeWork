package bsu.tat.triangle;


/**
 * Defines type and validate triangle's sides
 *
 * @author Aleksey Gudinsky
 */
public class Triangle {

    final String EQUILATERAL = "Triangle is Equilateral";
    final String ISOSCELES = "Triangle is Isosceles";
    final String USUAL = "Triangle is Usual";
    final String TRIANGLE_DONOT_EXIST = "Triangle can't have that length of sides";
    final String TRIANGLE_EXIST = "Triangle exist.";
    final String NEGATIVE_LENGTH = "Triangle can't have a side less then 0";
    final String ZERO_LENGTH = "Triangle can't have a side equal to 0";
    final String ERROR = "This is not triangle.";

    private double a;
    private double b;
    private double c;
    private int type;
    private int errorNumber;

    Triangle(double side_a, double side_b, double side_c) {
        a = side_a;
        b = side_b;
        c = side_c;
    }

    /**
     * get type of triangle
     *
     * @return int  which says quantity of same sides
     */
    private int getTriangleType() {
        if ((a == b) && (b == c) && (c == a)) {
            return type = 3;
        }
        if ((a == b) || (b == c) || (c == a)) {
            return type = 2;
        }
        if ((a != b) && (b != c) && (c != a)) {
            return type = 0;
        }
        return type = 666;
    }

    /**
     * validate triangle's sides for zero,negative values
     * and triangle's existence
     *
     * @return int which indicates type of wrong input
     */
    private int validateCoefficient() {
        if ((Double.isInfinite(1 / a)) || (Double.isInfinite(1 / b)) || (Double.isInfinite(1 / c))) {
            return errorNumber = 0;
        }
        if ((a < 0) || (b < 0) || (c < 0)) {
            return errorNumber = -1;
        }
        if ((a > (b + c)) || (b > (c + a)) || (c > (b + a))) {
            return errorNumber = 666;
        } else {
            return errorNumber = 1;
        }
    }

    /**
     * Printing String message in case of triangle's type
     */
    public void outputType() {
        if (Double.isInfinite(1.0 / getTriangleType())) {
            System.out.println(USUAL);
        }
        if (getType() == 2) {
            System.out.println(ISOSCELES);
        }
        if (getType() == 3) {
            System.out.println(EQUILATERAL);
        }
        if (getType() == 666) {
            System.out.println(ERROR);
        }
    }

    /**
     * Printing String message in case of triangle's wrong input
     */
    public void outputError() {
        if (Double.isInfinite(1 / getErrorNumber())) {
            System.out.println(ZERO_LENGTH);
        }
        if (getErrorNumber() == -1) {
            System.out.println(NEGATIVE_LENGTH);
        }
        if (getErrorNumber() == 666) {
            System.out.println(TRIANGLE_DONOT_EXIST);
        }
        if (getErrorNumber() == 1) {
            System.out.println(TRIANGLE_EXIST);
        }
    }

    public int getGetTriangleType() {
        return getTriangleType();
    }

    public int getValidateCoefficient() {
        return validateCoefficient();
    }

    public int getType() {
        return type;
    }

    public int getErrorNumber() {
        return errorNumber;
    }
}
