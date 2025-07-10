package labs.pm.optional;

import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InstanceOfExample {

    public void printProduct(Product product) {
        if (product instanceof Drink drink) {
            System.out.println(
                    "Product with name: " + drink.getName()
                            + " is Drink type.");
        } else if (product instanceof Food food) {
            System.out.println(
                    "Product with name: " + food.getName()
                            + " is Food type");
        }
    }

    public static void main(String[] args) {
        InstanceOfExample example = new InstanceOfExample();
        ProductManager pm = new ProductManager();

        Product p1 = pm.createProduct(100, "Kefir", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
        Product p2 = pm.createProduct(100, "English Muffin", BigDecimal.valueOf(4.35),
                Rating.FIVE_STAR, LocalDate.now());

        example.printProduct(p1);
        example.printProduct(p2);
        System.out.println("Is product1 equals to product2? " + p1.equals(p2));
    }
}
