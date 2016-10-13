package bsu.rfikt.tat.OOP;

/**
 * Class which counts an average price of products
 */
public class AveragePrice extends Commands {

    double price;
    int quantity;

    /**
     * For counting average value wee need to know
     * 2 things: price for 1 unit and quantity of them
     *
     * @param price
     * @param quantity
     */
    public AveragePrice(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Code that uses abstract method for counting it.
     */
    public void startCommand() {
        // some code
    }
}




