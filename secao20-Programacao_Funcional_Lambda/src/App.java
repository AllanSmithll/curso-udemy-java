import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double mim = 100.0;

        Predicate<Product> predicate = p -> p.getPrice() >= mim;

        list.removeIf(predicate);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
