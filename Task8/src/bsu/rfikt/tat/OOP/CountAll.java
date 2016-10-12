package bsu.rfikt.tat.OOP;

/**
 * Class which counts all products
 */
public class CountAll extends Commands {
    int quantity;

    /**
     * For counting all products we need to know
     * quantity of them.
     *
     * @param quantity
     */
    public CountAll(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Code that uses abstract method for counting it.
     */
    public void startCommand() {

        // some code
    }
}
