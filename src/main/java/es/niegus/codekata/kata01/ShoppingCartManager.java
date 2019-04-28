package es.niegus.codekata.kata01;

public class ShoppingCartManager {

    private OfferManager offerManager;

    public ShoppingCartManager(OfferManager offerManager) {
        this.offerManager = offerManager;
    }

    public void addProduct(ShoppingCart shoppingCart, Product product) {
        shoppingCart.addProduct(product);

        offerManager.applyOffers(shoppingCart);
    }
}
