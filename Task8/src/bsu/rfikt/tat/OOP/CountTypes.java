package bsu.rfikt.tat.OOP;

/**
 * Class which count quantity of different types
 */
public class CountTypes extends Commands {

    String type;
    int quantity;

    /**
     * For counting value wee need to know
     * 2 things is type of product and quantity of each products type
     *
     * @param type
     * @param quantity
     */
    public CountTypes(String type, int quantity) {

        this.quantity = quantity;
        this.type = type;
    }

    /**
     * Code that uses abstract method for counting it.
     */
    public void startCommand() {
        // some code
    }
}


