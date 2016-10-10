package bsu.rfikt.tat;

import java.util.Scanner;


/**
 * Main class which has a point of entry
 */
public class MainApplication {
    /**
     * Method main is a point of entry
     * Takes input data and makes a line for a further check
     * Makes instance of the rule-classes
     */
    public static void main(String[] args) {
        try {
            System.out.println("Input something ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            OnlyNumbers onlyNumbers = new OnlyNumbers(s);
            WithoutNumbers withoutNumbers = new WithoutNumbers(s);
            ContainSomeWords containSomeWords = new ContainSomeWords(s);
            ContainWord containWord = new ContainWord(s);

            containSomeWords.checkRule();
            onlyNumbers.checkRule();
            containWord.checkRule();
            withoutNumbers.checkRule();
        } catch (Exception e) {
            System.out.println("If you see this message, please reboot the program ");
        }
    }
}












