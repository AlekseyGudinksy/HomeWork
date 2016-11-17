package bsu.tat.triangle;

import java.util.Scanner;

/**
 * The point of entry
 *
 * @author Aleksey Gudinsky
 */
public class Main {

    /**
     * Input values of triangle's sides
     *
     * @param args is an argument for command line
     */
    public static void main(String[] args) {

        final String HELLO = "Input value of triangle side's";
        final String SYMBOL_INPUT = "You inputted symbols, not a number";
        final String LENGTH_OF_A_SIDE = "Length of side a is = ";
        final String LENGTH_OF_B_SIDE = "Length of side b is = ";
        final String LENGTH_OF_C_SIDE = "Length of side c is = ";
        double side_a;
        double side_b;
        double side_c;

        try {
            System.out.println(HELLO);
            Scanner in = new Scanner(System.in);
            side_a = in.nextDouble();
            System.out.println(LENGTH_OF_A_SIDE + side_a);
            side_b = in.nextDouble();
            System.out.println(LENGTH_OF_B_SIDE + side_b);
            side_c = in.nextDouble();
            System.out.println(LENGTH_OF_C_SIDE + side_c);

            Triangle tr = new Triangle(side_a, side_b, side_c);
            tr.getValidateCoefficient();
            tr.outputError();
            tr.getGetTriangleType();
            tr.outputType();

        } catch (Exception e) {
            System.out.println(SYMBOL_INPUT);
        }
    }
}


