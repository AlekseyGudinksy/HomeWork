package bsu.tat.triangle;

/**
 * Class which define type of triangle
 *
 * @author Aleksey Guidnsky
 */
public class TriangleDefine {
    static TriangleDefine td = new TriangleDefine();

    /**
     * Validate if type is equilateral, if not calls next method
     *
     * @param a is value of side a
     * @param b is value of side b
     * @param c is value of side c
     */
    public void defineType(double a, double b, double c) {
        if ((a == b) & (b == c)) {
            System.out.println(Messages.msg.EQUILATERAL);
            return;
        } else {
            defineIsosceles(a, b, c);
        }
    }

    /**
     * Validate if type is isosceles, if not calls next method
     *
     * @param a is value of side a
     * @param b is value of side b
     * @param c is value of side c
     */
    public void defineIsosceles(double a, double b, double c) {
        if ((a == b || (a == c) || (b == c))) {
            System.out.println(Messages.msg.ISOSCELES);
            return;
        } else {
            defineUsual(a, b, c);
        }
    }

    /**
     * @param a is value of side a
     * @param b is value of side b
     * @param c is value of side c
     */
    public void defineUsual(double a, double b, double c) {
        if ((a != b & (a != c) & (b != c))) {
            System.out.println(Messages.msg.USUAL);
            return;
        }
    }
}


