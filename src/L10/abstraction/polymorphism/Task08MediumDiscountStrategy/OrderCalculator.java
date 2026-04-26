package L10.abstraction.polymorphism.Task08MediumDiscountStrategy;

public class OrderCalculator {

    private DiscountPolicy discountPolicy;

    public OrderCalculator(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculateTotal(double amount) {
        return discountPolicy.apply(amount);
    }
}
