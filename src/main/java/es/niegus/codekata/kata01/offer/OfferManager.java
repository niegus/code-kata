package es.niegus.codekata.kata01.offer;

import es.niegus.codekata.kata01.product.Product;
import es.niegus.codekata.kata01.shoppingcart.ShoppingCart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OfferManager {

    private List<Offer> offers;

    public OfferManager() {
        // Load all possible offers
        offers = new ArrayList<Offer>();
    }

    public void applyOffers(ShoppingCart shoppingCart, List<Offer> offers) {
        for(Offer offer : offers) {
            OfferStrategy offerStrategy = offer.getOfferStrategy();
            offerStrategy.apply(shoppingCart, offer);
        }
    }

    public List<Offer> applicableOffers(Map<Product, Integer> products) {
        List<Offer> applicableOffers = new ArrayList<Offer>();
        for (Offer offer : offers) {
            // Check if offer is applicable
            // Check conflicting offers
            // Check is applicable more than one time
        }

        // Should only return non conflicting offers
        return applicableOffers;
    }

}
