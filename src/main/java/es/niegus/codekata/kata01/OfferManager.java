package es.niegus.codekata.kata01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OfferManager {

    private List<Offer> offers;

    public OfferManager() {
        offers = new ArrayList<Offer>();
        // Load all possible offers
    }

    public void applyOffers(ShoppingCart shoppingCart) {
        List<Offer> offers = findOffers(shoppingCart.getProducts());
        for(Offer offer : offers) {
            OfferStrategy offerStrategy = offer.getOfferStrategy();
            offerStrategy.apply(shoppingCart, offer);
        }
    }

    private List<Offer> findOffers(Map<Product, Integer> products) {
        // Find offers applicable to products
        // Should also return non conflicting offers
        return offers;
    }

}
