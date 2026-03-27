package Strategy;

public class CreditCardPayment implements IPaymentStrategy{
    public void pay(){
        System.out.println("CREDITCARD PAYMENT ENABLED");
    }
}
