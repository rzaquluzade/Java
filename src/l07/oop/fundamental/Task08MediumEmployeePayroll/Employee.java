package l07.oop.fundamental.Task08MediumEmployeePayroll;

public class Employee {

    private String name;
    private double baseSalary;
    private double bonus;

    public Employee (String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateNetSalary(double taxRate) {
        if (taxRate < 0 || taxRate > 1) {
            System.out.println("Invalid tax rate for " + name);
            return -1;
        }

        double grossSalary = baseSalary + bonus;
        double netSalary = grossSalary - (grossSalary * taxRate);
        return netSalary;
    }


    public void printReport(double taxRate) {
        double net = calculateNetSalary(taxRate);

        if (net == -1) return;

        System.out.println("Employee: " + this.name + ", Base: " + this.baseSalary + ", Bonus: " + this.bonus + ", Net Salary: " + net);
    }
}