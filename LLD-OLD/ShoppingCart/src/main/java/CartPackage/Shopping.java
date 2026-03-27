package CartPackage;

import Factory.FlatDiscountOffer;
import Factory.IOfferStrategy;
import Strategy.IPaymentStrategy;

import java.util.HashMap;
import java.util.Optional;

public class Shopping {

    HashMap<String, Cart> cartHashMap;
    IOfferStrategy offerStrategy;
    IPaymentStrategy paymentStrategy;
    Shopping(IOfferStrategy offerStrategy, IPaymentStrategy paymentStrategy){
        cartHashMap=new HashMap<>();
        this.offerStrategy = offerStrategy;
        this.paymentStrategy=paymentStrategy;
    }

    public Cart createCart(User user){
        Cart cart = new Cart(1, user);
        cartHashMap.put(user.getName(), cart);
        return cart;
    }


    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void addProductToCart(User user, Product product, int qty){
        Cart cart = cartHashMap.get(user.getName());
        if (cart == null) {
            cart = createCart(user);
        }

        Optional<Product> existingItem = cart.getProductList()
                .stream()
                .filter(item -> item.getId().equals(product.getId()))
                .findFirst();

        if (existingItem.isPresent()) {
            existingItem.get().increaseqty(qty);
            cart.setFinalPrice(cart.computeTotal());
            cart.setTotalPrice(cart.computeTotal());
        } else {
            cart.addProduct(product, qty);
            cart.setFinalPrice(cart.computeTotal());
            cart.setTotalPrice(cart.computeTotal());

        }
    }


    public int checkout(User user){
        Cart c = cartHashMap.get(user.getName());
        int total = c.computeTotal();

        System.out.println("before offer" + total);
        int discount = offerStrategy.apply(c);
        System.out.println("discount is" + discount);
        c.setFinalPrice(total-discount);
        System.out.println("after offer" + c.getFinalPrice());
        return c.getFinalPrice();

    }


    public void payment(){
        this.paymentStrategy.pay();
    }








}
