package L03.variables.homework;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task09HardSalarySlip {

    public static void main(String[] args) {

        BigDecimal baseSalary = new BigDecimal("1000");
        BigDecimal overtime = new BigDecimal("5");
        BigDecimal hurlyRate = new BigDecimal("8.50");
        BigDecimal overtimeRate = new BigDecimal("150.00");

        final BigDecimal taxInterest = new BigDecimal("0.15");
        final BigDecimal pensionInterest = new BigDecimal("0.04");

        BigDecimal additionalSalary = overtime.multiply(hurlyRate);
        BigDecimal totalSalary = baseSalary.add(additionalSalary).add(overtimeRate);

        BigDecimal tax = totalSalary.multiply(taxInterest);
        BigDecimal pension = totalSalary.multiply(pensionInterest);

        BigDecimal netSalary = totalSalary.subtract(tax).subtract(pension);

        totalSalary = totalSalary.setScale(2,RoundingMode.HALF_UP);
        tax = tax.setScale(2,RoundingMode.HALF_UP);
        pension = pension.setScale(2,RoundingMode.HALF_UP);
        netSalary = netSalary.setScale(2,RoundingMode.HALF_UP);

        System.out.println("------ MAAS QEBZI ------");
        System.out.printf("%-20s %10.2f\n", "Esas maas : ", baseSalary);
        System.out.printf("%-20s %10.2f\n", "Elave is : ", overtime);
        System.out.printf("%-20s %10.2f\n", "Bonus : ", overtimeRate);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %10.2f\n", "Umumi maas :", totalSalary);
        System.out.printf("%-20s %10.2f\n", "Vergi : ", tax);
        System.out.printf("%-20s %10.2f\n", "Pensiya : ", pension);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %10.2f\n", "Xalis maas :", netSalary);




    }
}
