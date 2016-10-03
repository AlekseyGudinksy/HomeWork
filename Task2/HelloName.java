/**
 * Class which output Hello, NAME
 * NAME takes as arguments from
 * command line.
 */

public class HelloName {
    /**
     * Method main is point of entry.
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = args.length - 1;
        System.out.println("Hello, " + args[i]);
    }
}
