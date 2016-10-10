package bsu.rfikt.tat;

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
        String vocabulary = ("OOP");
        for (String words : s.split("( |\\. |,|, )")) {
            if (vocabulary.equals(words)) {
                System.out.println("This word I saw in my vocabulary: " + vocabulary + " Rule 4");
            }
        }
    }
}




