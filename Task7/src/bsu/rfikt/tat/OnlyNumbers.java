package bsu.rfikt.tat;

/**
 * Class which checks input line has only for numbers
 * Rule 2
 */
public class OnlyNumbers extends Rules {
    String s;

    /**
     * @param s is a string variable where input line situated
     */
    public OnlyNumbers(String s) {
        this.s = s;
    }

    /**
     * Method which checks input line by regular expression
     */
    public void checkRule() {
        if (s.matches("^\\d+$"))
            System.out.println("I see a number. Rule 2 ");
    }
}

