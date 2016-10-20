/**
 * Method main is point of entry.
 *
 * @author Aleksey Gudinsky
 */
public class HelloName {
    /**
     * Output Hello, Name. Name takes as argument from command line.
     *
     * @param args is input argument from command line
     */
    public static void main(String[] args) {
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello, " + args[i]);
            }
        } else {
            System.out.println("Hello, My friend ");
        }
    }
}