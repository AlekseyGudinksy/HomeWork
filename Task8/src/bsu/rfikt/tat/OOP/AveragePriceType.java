package bsu.rfikt.tat.OOP;

/**
 * Class which counts average price for each type of product
 */
public class AveragePriceType extends Commands {

    double price;
    int quantity;
    String type;

    /**
     * For counting average value wee need to know
     * 3 things like: type, quantity and price
     *
     * @param type
     * @param quantity
     * @param price
     */
    public AveragePriceType(String type, int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
        this.type = type;

    }

    /**
     * Code that uses abstract method for counting it.
     */
    public void startCommand() {
// some code
    }
}
