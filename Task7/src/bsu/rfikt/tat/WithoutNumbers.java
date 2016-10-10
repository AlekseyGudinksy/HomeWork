package bsu.rfikt.tat;

/**
 * Class which checks if input line doesn't has any number
 * Rule 1
 */
public class WithoutNumbers extends Rules {
    String s;

    /**
     * @param s is a string variable where input line situated
     */
    public WithoutNumbers(String s) {
        this.s = s;
    }

    /**
     * Method which checks input line for
     * missing a number by regular expression
     */
    public void checkRule() {
        if (s.matches("^\\D+$")) {
            System.out.println("Input data doesn't has any number. Rule 1");
        }
    }
}



