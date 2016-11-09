package bsu.tat.triangle;

/**
 * Class which contains method calls
 */
public class MethodsCalls {
    public static void call(double a, double b, double c) {
        TriangleCheck.tch.zeroValidator(a, b, c);
        TriangleCheck.tch.negativeValidator(a, b, c);
        TriangleCheck.tch.existValidator(a, b, c);
    }
}
