package L10.abstraction.polymorphism.Task08MediumDiscountStrategy;

public class NoDiscount implements DiscountPolicy {

    @Override
    public double apply(double amount) {
        return amount;
    }
}
