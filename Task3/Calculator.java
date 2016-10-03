/**
 * Including library for Scanner
 * which can parse strings
 * using regular expressions.
 */

import java.util.Scanner;

/**
 * Class which takes the numbers from CommandLine
 * by user whose types them from keyboard.
 * If user type symbols, the number will be = 0.
 */

public class Calculator {
    public static void main(String[] args) {
        double number1 = 0;
        double number2 = 0;
        System.out.println("Input a number, please ");
        System.out.println("WARNING: if you input not a number, number will default = 0 ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
            System.out.println("1st number is = " + number1);
        } else
            System.out.println("You inputted not a number, number is default");
        if (scanner.hasNextDouble()) {
            number2 = scanner.nextDouble();
            System.out.println("2nd number is = " + number2);
        } else
            System.out.println("You inputted not a number, number is default");
        OutputResults(number1, number2);
    }

    /**
     * Method which calculate
     * Sum, Difference, Composition and Private
     * checks dividing number by zero,
     * output results of Math Operations.
     *
     * @param n1
     * @param n2
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
        if (Double.isInfinite(sum)) {
            System.out.println("Private is = " + (privat));
        } else
            System.out.println("Error, you can't divide by zero");
    }
}



