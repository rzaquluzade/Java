package L09.oop.inheritance.objectclass.Task05MediumSuperMethod;

import java.security.PublicKey;

public class SalariedEmployee extends Employee {

    private double bonus;

    public SalariedEmployee (double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {

        double base = super.calculatePay();

        double totalSalary = bonus + base;

        System.out.println("Bonus : " + bonus);
        System.out.println("Total salary : " + totalSalary);

        return totalSalary;
    }
}
