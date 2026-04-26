package L10.abstraction.polymorphism.Task05MediumPaymentGateway;

public class CheckoutService {

    private PaymentGateway paymentGateway;

    public CheckoutService (PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout (double amount) {
        boolean success = paymentGateway.charge(amount);
        if (success) {
            System.out.println("Checkout successful");
        } else {
            System.out.println("Payment failed");
        }
    }
}
