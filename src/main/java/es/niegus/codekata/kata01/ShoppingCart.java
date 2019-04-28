package es.niegus.codekata.kata01;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> products;

    private BigDecimal price;

    public ShoppingCart() {
        products = new HashMap<Product, Integer>();
        price = new BigDecimal(0);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    void addProduct(Product product) {
        Integer quantity = 1;

        if(products.containsKey(product)) {
            quantity = products.get(product);
            quantity++;
        }

        products.put(product, quantity);
    }

    void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
