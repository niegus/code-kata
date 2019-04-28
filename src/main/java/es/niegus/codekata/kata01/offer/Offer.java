package es.niegus.codekata.kata01.offer;

import es.niegus.codekata.kata01.product.Product;
import java.util.List;
import java.util.Map;

public abstract class Offer {

    //At least one product
    private Map<Product, Integer> applicableProducts;

    private List<Offer> conflictingOffers;

    public abstract OfferStrategy getOfferStrategy();

    public Map<Product, Integer> getApplicableProducts() {
        return applicableProducts;
    }

    public void setApplicableProducts(Map<Product, Integer> applicableProducts) {
        this.applicableProducts = applicableProducts;
    }

    public List<Offer> getConflictingOffers() {
        return conflictingOffers;
    }

    public void setConflictingOffers(List<Offer> conflictingOffers) {
        this.conflictingOffers = conflictingOffers;
    }

}
