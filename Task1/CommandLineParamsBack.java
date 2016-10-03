/**
 * Output parameters of command line in the opposite order
 */
public class CommandLineParamsBack {
    /**
     * Calling method main which run along the whole length of the array "args"
     * including last element "0"
     *
     * @param args is input arguments
     */
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Parameter " + i + " = " + args[i]);
        }
    }
}