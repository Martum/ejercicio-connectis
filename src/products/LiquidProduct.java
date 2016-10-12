package products;

import java.math.BigDecimal;

/**
 * Created by montenegromi on 11/10/16.
 */
public class LiquidProduct extends Product {
    private Double liters;

    public LiquidProduct(String name, BigDecimal price, Double liters) {
        super(name, price);
        this.liters = liters;
    }

    protected String showLiters(){
        return "Litros: " + this.liters;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(showName()).append(" /// ").append(showLiters()).append(" /// ").append(showPrice());

        return str.toString();
    }
}
