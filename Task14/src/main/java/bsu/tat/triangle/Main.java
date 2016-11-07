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
        double a = 0;
        double b = 0;
        double c = 0;
        try {
            System.out.println(Messages.msg.HELLO);
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            System.out.println(Messages.msg.LENGTH_OF_A_SIDE + a);
            System.out.println(Messages.msg.LENGTH_OF_B_SIDE + b);
            System.out.println(Messages.msg.LENGTH_OF_C_SIDE + c);
            MethodsCalls.call(a, b, c);
        } catch (Exception e) {
            System.out.println(Messages.msg.SYMBOL_INPUT);
        }
    }
}



