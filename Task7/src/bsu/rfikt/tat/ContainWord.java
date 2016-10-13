package bsu.rfikt.tat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class check input line for a word from a vocabulary
 * Rule 4
 */
public class ContainWord extends Rules {
    String s;

    /**
     * @param s is a string variable where input line situated
     */
    public ContainWord(String s) {
        this.s = s;
    }

    /**
     * Method which check line for a word by regular expressions
     * and equals each word with word from vocabulary
     */
    public void checkRule() {
        String[] vocabulary = {"OOP", "is", "a", "magic", "thing"};
        for (String words : s.split("[\\.,?!()\\s\\-]+")) {
            for (String voc : vocabulary) {
                if (words.equalsIgnoreCase(voc)) {
                    System.out.println("This word I saw in my vocabulary: " + voc + " Rule 4");
                }
            }
        }
    }
}





