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

        double side_a;
        double side_b;
        double side_c;

        try {

            System.out.println(Messages.HELLO);
            Scanner in = new Scanner(System.in);
            side_a = in.nextDouble();
            System.out.println(Messages.LENGTH_OF_A_SIDE + side_a);
            side_b = in.nextDouble();
            System.out.println(Messages.LENGTH_OF_B_SIDE + side_b);
            side_c = in.nextDouble();
            System.out.println(Messages.LENGTH_OF_C_SIDE + side_c);

            Triangle tr = new Triangle(side_a, side_b, side_c);
            //
            tr.validateCoefficient();

            tr.outputType();
            tr.getTriangleType();
            tr.outputError();

        } catch (Exception e) {
            System.out.println(Messages.SYMBOL_INPUT);
        }
    }
}


