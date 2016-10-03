/**
 * Output parameters of command line in the opposite order
 **/
public class Calculator {
    /**
     * Method main is point of entry,input numbers and check them for nothing
     * was inputted calls method OutputResults.
     *
     * @param args is input from command line
     */
    public static void main(String[] args) {
        double number1 = 0;
        double number2 = 0;
        System.out.println("Input a number, please ");
        System.out.println("WARNING: if you do not input any number, number will default = 0 ");
        if (args.length != 0) {
            number1 = Double.parseDouble(args[0]);
            number2 = Double.parseDouble(args[1]);
            System.out.println("1st number is = " + number1);
            System.out.println("2nd number is = " + number2);
        } else {
            System.out.println("You inputted nothing = ");
        }
        OutputResults(number1, number2);
    }

    /**
     * Method which calculate Sum, Difference, Composition and Private
     * checks dividing number by zero, output results of Math Operations.
     *
     * @param n1 is number1
     * @param n2 is number2
     */

    public static void OutputResults(double n1, double n2) {
        System.out.println();
        System.out.println("Math operations: ");
        double sum;
        sum = (n1 + n2);
        System.out.println("Sum is = " + (sum));
        double difference;
        difference = (n1 - n2);
        System.out.println("Difference is = " + (difference));
        double composition;
        composition = (n1 * n2);
        System.out.println("Composition is = " + (composition));
        double privat;
        privat = (n1 / n2);

        if (Double.isFinite(privat)) {
            System.out.println("Private is = " + (privat));
        } else {
            System.out.println("Error, you can't divide by zero");
        }
    }
}




