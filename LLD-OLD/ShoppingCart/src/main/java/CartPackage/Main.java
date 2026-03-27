package CartPackage;

import Factory.FlatDiscountOffer;
import Factory.IOfferStrategy;
import Factory.PercentageDiscountOffer;
import Factory.createOfferFactory;
import Strategy.CreditCardPayment;
import Strategy.IPaymentStrategy;
import Strategy.UPIPaymentStrategy;

public class Main {
    public static void main(String[] args) {


        User user = new User("anjali");

        IOfferStrategy offerStrategy = createOfferFactory.getOffer("Percentage");
        IPaymentStrategy paymentStrategy = new UPIPaymentStrategy();
        Shopping shopping = new Shopping(offerStrategy , paymentStrategy);

        Product p1 = new Product("laptop", 1, 1, 80000);
        Product p2 = new Product( "Headphones", 1, 1, 1000);
        Cart cart = shopping.createCart(user); // get or create

        // Step 5: Add Products to Cart
        shopping.addProductToCart(user, p1, 1);
        shopping.addProductToCart(user, p2, 2);
        shopping.addProductToCart(user, p1, 1); // duplicate add (should increase qty)

        // Step 6: Checkout
        double finalAmount = shopping.checkout(user);

        // Step 7: Print Cart Details

        System.out.println("Cart Items:");
        for (Product item : cart.getProductList()) {
            System.out.println(
                    "ProductId: " + item.getName() +
                            ", Quantity: " + item.getQty() +
                            ", Price: " + item.getPrice()
            );
        }

        System.out.println("Final Amount after discount: " + finalAmount);

        shopping.payment();

        shopping.setPaymentStrategy(new CreditCardPayment());

        shopping.payment();

    }
}
