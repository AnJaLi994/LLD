package Factory;

public class createOfferFactory {

    public static IOfferStrategy getOffer(String coupon){
        switch (coupon){
            case "Flat" : return new FlatDiscountOffer();
            case "Percentage" : return new PercentageDiscountOffer();
            default: throw new IllegalArgumentException();
        }
    }
}
