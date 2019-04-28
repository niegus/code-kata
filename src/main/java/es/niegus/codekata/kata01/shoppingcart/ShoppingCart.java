package es.niegus.codekata.kata01.shoppingcart;

import es.niegus.codekata.kata01.offer.Offer;
import es.niegus.codekata.kata01.product.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> products;

    private BigDecimal price;

    private List<Offer> appliedOffers;

    public ShoppingCart() {
        products = new HashMap<Product, Integer>();
        price = new BigDecimal(0);
        appliedOffers = new ArrayList<Offer>();
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

    public List<Offer> getAppliedOffers() {
        return appliedOffers;
    }

    public void setAppliedOffers(List<Offer> appliedOffers) {
        this.appliedOffers = appliedOffers;
    }

}
