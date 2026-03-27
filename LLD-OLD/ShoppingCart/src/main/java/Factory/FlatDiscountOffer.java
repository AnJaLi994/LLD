package Factory;

import CartPackage.Cart;

public class FlatDiscountOffer implements IOfferStrategy{

    @Override
    public int apply(Cart cart) {

        return 100;
    }
}
