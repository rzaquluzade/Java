package L10.abstraction.polymorphism.Task02EasyOverloadingPractice;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum (int a, int b) : 10 + 5 = " + calc.sum(10, 5));
        System.out.println("Sum (double a, double b) : 20.5 + 15.3 = " + calc.sum(20.5,15.3));
        System.out.println("Sum (int a, int b, int c) : 5 + 10 + 15 = " + calc.sum(5,10,15));

    }
}
