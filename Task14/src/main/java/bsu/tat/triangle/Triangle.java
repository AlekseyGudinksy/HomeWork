package bsu.tat.triangle;

/**
 * Defines type and validate triangle's sides
 *
 * @author Aleksey Gudinsky
 */
public class Triangle {

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
    int getTriangleType() {
        if ((a == b) & (b == c) & (c == a)) {
            return type = 3;
        }
        if ((a != b) & (b != c) & (c != a)) {
            return type = 0;
        }
        if ((a == b) || (b == c) || (c == a)) {
            return type = 2;
        }
        return type = 666;
    }

    /**
     * validate triangle's sides for zero,negative values
     * and triangle's existence
     *
     * @return int which indicates type of wrong input
     */
    int validateCoefficient() {
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
    void outputType() {
        if (Double.isInfinite(1 / getType())) {
            System.out.println(Messages.USUAL);
        }
        if (getType() == 2) {
            System.out.println(Messages.ISOSCELES);
        }
        if (getType() == 3) {
            System.out.println(Messages.EQUILATERAL);
        }
        if (getType() == 666) {
            System.out.println(Messages.ERROR);
        }
    }

    /**
     * Printing String message in case of triangle's wrong input
     */
    void outputError() {
        if (Double.isInfinite(1 / getErrorNumber())) {
            System.out.println(Messages.ZERO_LENGTH);
        }
        if (getErrorNumber() == -1) {
            System.out.println(Messages.NEGATIVE_LENGTH);
        }
        if (getErrorNumber() == 666) {
            System.out.println(Messages.TRIANGLE_DONOT_EXIST);
        }
        if (getErrorNumber() == 1) {
            System.out.println(Messages.TRIANGLE_EXIST);
        }
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public int getType() {
        return type;
    }
}
