package bsu.tat.calculator;

/**
 * Main is an entry point
 *
 * @author Alexey Gudinsky
 */
public class Main {
    /**
     * @param args is array which contains inputted arguments
     */
    public static void main(String[] args) {
        double number1 = 0;
        double number2 = 0;
        final String NUMBER1 = "1st number is = ";
        final String NUMBER2 = "2nd number is = ";
        final String EMPTY = "ERROR: you inputted nothing, numbers are equal to zero. ";
        final String NOT_FULL = "ERROR: you inputted not enough numbers, please input the right amount of numbers. ";
        final String TO_MUCH_NUMBERS = "ERROR: you inputted to much numbers, please input the right amount of numbers. ";
        final String EXPRESSIONS = "\nMath operations: ";
        final String SUM = "Sum is = ";
        final String DIFFERENCE = "Difference is = ";
        final String COMPOSITION = "Composition is = ";
        final String PRIVATE = "Private is = ";
        //TODO add try catch for non numeric input
        if (args.length == 0) {
            //TODO use define try catch to this exception
            // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
            System.out.println(EMPTY);
        } else if (args.length < 2) {
            // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
            //TODO use define try catch to this exception
            System.out.println(NOT_FULL);
        } else if (args.length > 2) {
            //TODO use define try catch to this exception
            System.out.println(TO_MUCH_NUMBERS);
        } else if (args.length == 2) {
            number1 = Double.parseDouble(args[0]);
            number2 = Double.parseDouble(args[1]);
            System.out.println(NUMBER1 + number1);
            System.out.println(NUMBER2 + number2);

            Computation computation = new Computation(number1, number2);

            System.out.println(EXPRESSIONS);
            System.out.println(SUM + computation.getSum());
            System.out.println(DIFFERENCE + computation.getDifference());
            System.out.println(COMPOSITION + computation.getComposition());
            System.out.println(PRIVATE + computation.getPrivat());
        }
    }
}
