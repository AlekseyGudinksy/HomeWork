package bsu.tat.triangle;


/**
 * Class which check  side's value for
 * equal to 0,negative or triangle existence
 *
 * @author Aleksey Gudinsky
 */
public class TriangleCheck {
    static TriangleCheck tch = new TriangleCheck();

    /**
     * @param a is value of side a
     * @param b is value of side b
     * @param c is value of side c
     * @return stops the method
     */
    public void zeroValidator(double a, double b, double c) {
        if ((Double.isInfinite(1 / a)) || (Double.isInfinite(1 / b)) || (Double.isInfinite(1 / c))) {
            System.out.println(Messages.msg.ZERO_LENGTH);
            return;
        }
    }

    /**
     * @param a is value of side a
     * @param b is value of side b
     * @param c is value of side c
     * @return stops the method
     */
    public void negativeValidator(double a, double b, double c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println(Messages.msg.NEGATIVE_LENGTH);
            return;
        }
    }

    /**
     * @param a is value of side a
     * @param b is value of side b
     * @param c is value of side c
     * @return stops the method
     */
    public void existValidator(double a, double b, double c) {
        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
            System.out.println(Messages.msg.TRIANGLE_DONOT_EXIST);
            return;
        } else {
            TriangleDefine.td.defineType(a, b, c);
        }
    }
}



