package bsu.rfikt.tat.OOP;

/**
 * Class which contains of all products
 */
public class Products {

    private String type;
    private String name;
    private int quantity;
    private double price;

    /**
     * Making a base for all input fields
     *
     * @param type
     * @param name
     * @param quantity
     * @param price
     */
    public Products(String type, String name, int quantity, double price) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}


//System.out.println(type.productstype)


