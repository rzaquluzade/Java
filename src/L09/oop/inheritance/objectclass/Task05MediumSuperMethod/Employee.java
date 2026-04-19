package L09.oop.inheritance.objectclass.Task05MediumSuperMethod;

public class Employee {

    protected double baseSalary;

    public Employee (double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        System.out.println("Base salary : " + baseSalary);
        return baseSalary;
    }
}
