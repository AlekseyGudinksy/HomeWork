/**
 * Class which output Hello, Name, Name takes as arguments from command line.
 */
public class HelloName {
    /**
     * Method main is point of entry.
     *
     * @param args is input argument from command line
     */
    public static void main(String[] args) {
        System.out.print("Hello, ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
        System.out.println();
    }
}