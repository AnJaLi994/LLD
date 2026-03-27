package Factory;

import CartPackage.Cart;

public class PercentageDiscountOffer implements IOfferStrategy{
    @Override
    public int apply(Cart c) {
        return (int) (c.getFinalPrice() * .10);

    }
}
