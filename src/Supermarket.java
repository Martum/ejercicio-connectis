import products.FractionalProduct;
import products.GenericProduct;
import products.LiquidProduct;
import products.Product;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Supermarket {

    private static List<Product> products;

    public static void main(String[] args) {
        availableProducts()
            .stream()
            .forEach(System.out::println);

        System.out.println("--------");
    }

    private static List<Product> availableProducts(){
        if(products == null) {
            products = Arrays.asList(
                    new LiquidProduct("Coca-Cola Zero", new BigDecimal(20), 1.5),
                    new LiquidProduct("Coca-Cola", new BigDecimal(18), 1.5),
                    new GenericProduct("Shampoo Sedal", new BigDecimal(30), "500mm"),
                    new FractionalProduct("Frutillas", new BigDecimal(64), "kilo")
            );
        }

        return products;
    }
}
