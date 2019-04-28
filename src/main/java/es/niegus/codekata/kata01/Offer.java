package es.niegus.codekata.kata01;

public abstract class Offer {

    //At least one product
    private Product product;

    public abstract boolean isApplicable();

    public abstract OfferStrategy getOfferStrategy();

}
