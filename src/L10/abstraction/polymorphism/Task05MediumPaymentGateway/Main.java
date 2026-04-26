package L10.abstraction.polymorphism.Task05MediumPaymentGateway;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        PaymentGateway card = new CardGateway();
        CheckoutService cardCheckout = new CheckoutService(card);
        cardCheckout.checkout(50);

        System.out.println();

        PaymentGateway cash = new CardGateway();
        CheckoutService cashCheckout =  new CheckoutService(cash);
        cardCheckout.checkout(40);

    }
}
