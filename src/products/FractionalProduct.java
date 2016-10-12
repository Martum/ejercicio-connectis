package products;

import java.math.BigDecimal;

/**
 * Created by montenegromi on 11/10/16.
 */
public class FractionalProduct extends Product {
    private String unit;

    public FractionalProduct(String name, BigDecimal price, String unit) {
        super(name, price);
        this.unit = unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(showName()).append(showPrice()).append(showUnit());

        return str.toString();
    }

    protected String showUnit(){
        return "Unidad de venta: " + this.unit;
    }
}
