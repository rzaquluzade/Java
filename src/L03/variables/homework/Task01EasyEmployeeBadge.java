package L03.variables.homework;

public class Task01EasyEmployeeBadge {

    public static void main(String[] args) {

        // Sabit
        final String CompanyName = "Texnoera Akademy";

        // Deyisenler
        String name = "Rza";
        int age = 24;
        String department = "IT";
        int yearsAtCompany = 2;
        boolean activity = true;
        double hourlyWages = 10.5;

        // Operator
        hourlyWages += 2.5;

        // Çıxış
        System.out.printf("Company : %s \n Name : %s \n Age : %d \n Department : %s \n Years : %d \n " +
                "Active : %b \n Hourly Wages : %.2f\n", CompanyName, name, age, department, yearsAtCompany, activity, hourlyWages);

    }
}
