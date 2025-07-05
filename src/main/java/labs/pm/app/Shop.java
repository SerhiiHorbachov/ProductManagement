package labs.pm.app;

import labs.pm.data.Product;

import java.math.BigDecimal;


/**
 * {@code Shop} class represents an application that manages Products
 *
 * @author oracle
 * @version 4.0
 */
public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(101);
        p1.setName("Test");
        p1.setPrice(BigDecimal.valueOf(1.99));

        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount());
    }
}
