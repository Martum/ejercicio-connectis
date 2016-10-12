package products.utils;

import products.Product;

/**
 * Created by montenegromi on 11/10/16.
 */
public class ProductComparators {
    public static int byPrice(Product product, Product otherProduct){
        return product.getPrice().compareTo(otherProduct.getPrice());
    }
}
