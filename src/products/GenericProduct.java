package products;

import java.math.BigDecimal;

/**
 * Created by montenegromi on 11/10/16.
 */
public class GenericProduct extends Product {
    private String content;

    public GenericProduct(String name, BigDecimal price, String content) {
        super(name, price);
        this.content = content;
    }

    protected String showContent(){
        return "Contenido: " + this.content;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(showName()).append(showContent()).append(showPrice());

        return str.toString();
    }
}
