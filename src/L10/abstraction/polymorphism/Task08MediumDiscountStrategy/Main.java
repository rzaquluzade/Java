package L10.abstraction.polymorphism.Task08MediumDiscountStrategy;

public class Main {

    public static void main(String[] args) {

        double amount = 100;

        OrderCalculator calculator = new OrderCalculator(new NoDiscount());
        System.out.println("No Discount: " + calculator.calculateTotal(amount));

        calculator.setDiscountPolicy(new PercentDiscount(20));
        System.out.println("20% Discount: " + calculator.calculateTotal(amount));

        calculator.setDiscountPolicy(new ThresholdDiscount(80, 15));
        System.out.println("Threshold Discount: " + calculator.calculateTotal(amount));

    }
}
