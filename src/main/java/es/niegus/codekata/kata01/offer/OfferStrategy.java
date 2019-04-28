package es.niegus.codekata.kata01.offer;

import es.niegus.codekata.kata01.shoppingcart.ShoppingCart;

public abstract class OfferStrategy {

    public abstract void apply(ShoppingCart shoppingCart, Offer offer);

}
