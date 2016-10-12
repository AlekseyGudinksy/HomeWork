package bsu.rfikt.tat.OOP;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class which takes input data
 * creating examples of all command-classes
 * Catching a mistake
 */
public class InputProductsData {
    // ArrayList<Products> products = new ArrayList<>();

    /**
     * Taking input data
     *
     * @param args
     */
    public void InputProductsData(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Input product's information: ");
            System.out.println("Input product's type: ");
            String type = in.nextLine();
            System.out.println("Input product's name: ");
            String name = in.nextLine();
            System.out.println("Input product's quantity: ");
            int quantity = in.nextInt();
            System.out.println("Input product's averagePrice for 1 unit: ");
            double price = in.nextDouble();

            CountAll all = new CountAll(quantity);
            AveragePrice averagePrice = new AveragePrice(price, quantity);
            AveragePriceType countPriceType = new AveragePriceType(type, quantity, price);
            CountTypes types = new CountTypes(type, quantity);

            all.startCommand();
            averagePrice.startCommand();
            countPriceType.startCommand();
            types.startCommand();
        } catch (Exception e) {
            System.out.println("You should use right type of data ");
        }
    }
}

