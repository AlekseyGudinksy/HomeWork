/**
 * Main is an entry point
 *
 * @author Aleksey Gudinsky
 **/
public class Calculator {
    /**
     * Input numbers and check them for nothing
     * was inputted, calls method OutputResults.
     *
     * @param args is input argument from command line
     */

    private static final String START_MESSAGE
            = "Please, input two numbers by space as arguments in command line\n"
            + "WARNING: if you do not input any number, number will default = 0\n";
    private static final String NUMBER1 = "1st number is = ";
    private static final String NUMBER2 = "2nd number is = ";
    private static final String EMPTY = "ERROR: you inputted nothing";
    private static final String WRONG_INPUT = "Error, you inputted not a number ";
    private static final String EXPRESSIONS = "\n\nMath operations: ";
    private static final String SUM = "Sum is = ";
    private static final String DIFFERENCE = "Difference is = ";
    private static final String COMPOSITION = "Composition is = ";
    private static final String PRIVATE = "Private is = ";
    private static final String DIVIDE_BY_ZERO = "ERROR: you can't divide by zero";
    private static double number1;
    private static double number2;

    public static void main(String[] args) {
        try {

            System.out.println(START_MESSAGE);
            if (args.length != 0) {
                number1 = Double.parseDouble(args[0]);
                number2 = Double.parseDouble(args[1]);
                System.out.println(NUMBER1 + number1);
                System.out.println(NUMBER2 + number2);
            } else {
                System.out.println(EMPTY);
            }
            OutputResults(number1, number2);
        } catch (Exception e) {
            System.out.println(WRONG_INPUT);
        }
    }

    /**
     * Method which calculate Sum, Difference, Composition and Private
     * checks dividing number by zero, output results of Math Operations.
     *
     * @param number1 is fist inputted number
     * @param number2 is second inputted number
     */
    public static void OutputResults(double number1, double number2) {
        System.out.println(EXPRESSIONS);
        double sum;
        sum = (number1 + number2);
        System.out.println(SUM + sum);
        double difference;
        difference = (number1 - number2);
        System.out.println(DIFFERENCE + difference);
        double composition;
        composition = (number1 * number2);
        System.out.println(COMPOSITION + composition);
        double privat;
        privat = (number1 / number2);

        if (Double.isFinite(privat)) {
            System.out.println(PRIVATE + privat);
        } else {
            System.out.println(DIVIDE_BY_ZERO);
        }
    }
}




