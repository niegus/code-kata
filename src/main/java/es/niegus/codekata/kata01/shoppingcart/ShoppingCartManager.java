package es.niegus.codekata.kata01.shoppingcart;

import es.niegus.codekata.kata01.offer.Offer;
import es.niegus.codekata.kata01.offer.OfferManager;
import es.niegus.codekata.kata01.product.Product;
import java.util.List;

public class ShoppingCartManager {

    private OfferManager offerManager;

    public ShoppingCartManager(OfferManager offerManager) {
        this.offerManager = offerManager;
    }

    public void addProduct(ShoppingCart shoppingCart, Product product) {
        shoppingCart.addProduct(product);

        List<Offer> applicableOffers = offerManager.applicableOffers(shoppingCart.getProducts());
        offerManager.applyOffers(shoppingCart, applicableOffers);

        shoppingCart.setAppliedOffers(applicableOffers);
    }
}
