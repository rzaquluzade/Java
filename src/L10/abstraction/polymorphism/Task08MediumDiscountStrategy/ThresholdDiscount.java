package L10.abstraction.polymorphism.Task08MediumDiscountStrategy;

public class ThresholdDiscount implements DiscountPolicy {

    private double threshold;
    private double discountAmount;

    public ThresholdDiscount(double threshold, double discountAmount) {
        this.threshold = threshold;
        this.discountAmount = discountAmount;
    }

    @Override
    public double apply(double amount) {
        if (amount >= threshold) {
            return amount - discountAmount;
        }
        return amount;
    }
}
