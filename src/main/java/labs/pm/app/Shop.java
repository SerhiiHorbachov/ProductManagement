package labs.pm.app;

import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * {@code Shop} class represents an application that manages Products
 *
 * @author oracle
 * @version 4.0
 */
public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("es-US");

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(101);
        p1 = pm.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of tea");
        p1 = pm.reviewProduct(101, Rating.TWO_STAR, "Rather weak tea");
        p1 = pm.reviewProduct(101, Rating.FOUR_STAR, "Fine tea");
        p1 = pm.reviewProduct(101, Rating.FOUR_STAR, "Good tea");
        p1 = pm.reviewProduct(101, Rating.FIVE_STAR, "Perfect tea");
        p1 = pm.reviewProduct(101, Rating.THREE_STAR, "Just add some lemon");
        pm.printProductReport(101);

        pm.changeLocale("en-GB");

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p2 = pm.reviewProduct(102, Rating.THREE_STAR, "Coffee was ok");
        p2 = pm.reviewProduct(102, Rating.ONE_STAR, "Where is the milk");
        p2 = pm.reviewProduct(102, Rating.FIVE_STAR, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(102);

        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(1.99), Rating.NOT_RATED, LocalDate.now().plusDays(2));
        p3 = pm.reviewProduct(103, Rating.FIVE_STAR, "Very nice cake");
        p3 = pm.reviewProduct(103, Rating.FOUR_STAR, "It's good but I've expected more chocolate");
        p3 = pm.reviewProduct(103, Rating.FIVE_STAR, "This cake is perfect!");
        pm.printProductReport(103);

        Product p4 = pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), Rating.NOT_RATED, LocalDate.now());
        p4 = pm.reviewProduct(104, Rating.THREE_STAR, "Just another cookie");
        p4 = pm.reviewProduct(104, Rating.THREE_STAR, "OK");
        pm.printProductReport(104);

        Product p5 = pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        p5 = pm.reviewProduct(105, Rating.FOUR_STAR, "Tasty");
        p5 = pm.reviewProduct(105, Rating.FOUR_STAR, "Not bad at all");
        pm.printProductReport(105);

        Product p6 = pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now().plusDays(3));
        p6 = pm.reviewProduct(106, Rating.TWO_STAR, "Too sweet");
        p6 = pm.reviewProduct(106, Rating.THREE_STAR, "Better than cookie");
        p6 = pm.reviewProduct(106, Rating.TWO_STAR, "Too bitter");
        p6 = pm.reviewProduct(106, Rating.ONE_STAR, "I don't get it");
        pm.printProductReport(106);
    }
}
