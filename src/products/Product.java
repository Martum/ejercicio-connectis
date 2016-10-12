package products;

import java.math.BigDecimal;

/**
 * Created by montenegromi on 11/10/16.
 */
public abstract class Product {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    protected String showName(){
        return "Nombre: " + getName();
    }

    protected String showPrice(){
        return "Precio: " + getPrice();
    }
}
