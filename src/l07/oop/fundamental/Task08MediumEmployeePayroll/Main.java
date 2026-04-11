package l07.oop.fundamental.Task08MediumEmployeePayroll;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ali", 1000, 200);
        Employee e2 = new Employee("Veli", 1500, 300);
        Employee e3 = new Employee("Aysel", 2000, 500);

        double taxRate = 0.1;

        e1.printReport(taxRate);
        e2.printReport(taxRate);
        e3.printReport(taxRate);
    }
}
