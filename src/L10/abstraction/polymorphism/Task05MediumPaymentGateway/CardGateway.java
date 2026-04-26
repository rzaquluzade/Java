package L10.abstraction.polymorphism.Task05MediumPaymentGateway;

public class CardGateway implements PaymentGateway {

    @Override
    public boolean charge(double amount) {
        System.out.println("Cart payment was made : " + amount + " AZN");
        return true;
    }
}
