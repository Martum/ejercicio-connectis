import products.FractionalProduct;
import products.GenericProduct;
import products.LiquidProduct;
import products.Product;
import products.utils.ProductComparators;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Supermarket {

    private static List<Product> products;

    public static void main(String[] args) {
        availableProducts()
            .stream()
            .forEach(System.out::println);

        System.out.println("--------");

        System.out.println("Producto mas caro: " + mostExpensiveProduct().map(Product::getName).orElse(" - "));
        System.out.println("Producto mas barato: " + cheapestProduct().map(Product::getName).orElse(" - "));
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

    private static Optional<Product> mostExpensiveProduct(){
        return availableProducts().stream().max(ProductComparators::byPrice);
    }

    private static Optional<Product> cheapestProduct(){
        return availableProducts().stream().min(ProductComparators::byPrice);
    }
}
