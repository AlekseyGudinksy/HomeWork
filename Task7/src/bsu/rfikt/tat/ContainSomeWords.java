package bsu.rfikt.tat;

/**
 * Class which checks input line for more then 5 words.
 * Rule 3
 */
public class ContainSomeWords extends Rules {
    String s;

    /**
     * @param s is a string variable where input line situated
     */
    public ContainSomeWords(String s) {
        this.s = s;
    }

    /**
     * This method checks line by splitting it
     * and equals if it has more then 5 words
     */
    public void checkRule() {
        String[] words = s.split("[\\wа-яА-Я]+");
        if (words.length > 5) {
            System.out.println("I see more then 5 words. Rule 3 ");
        }
    }
}


