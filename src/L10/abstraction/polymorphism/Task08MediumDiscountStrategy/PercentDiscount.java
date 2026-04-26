package L10.abstraction.polymorphism.Task08MediumDiscountStrategy;

public class PercentDiscount implements DiscountPolicy {

    private double percent;

    public PercentDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double amount) {
        return amount - (amount * percent / 100);
    }
}
