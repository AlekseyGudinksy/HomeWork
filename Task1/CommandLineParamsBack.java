/**
 * Main is an entry point.
 *
 * @author Aleksey Gudinsky
 */
public class CommandLineParamsBack {
    /**
     * Running along the whole length of the array "args"
     * Output arguments of command line in opposite order
     *
     * @param args is input arguments
     */

    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Parameter " + i + " = " + args[i]);
        }
    }
}