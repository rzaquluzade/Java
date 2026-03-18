package L03.variables.homework;

import java.math.BigDecimal;

public class Task05MediumInvoicePrecision {

    public static void main(String[] args) {

         double value1 = 19.99,
                value2 = 5.75,
                value3 = 2.40;

         double totalValue = value1 + value2 + value3;

         System.out.printf("Total Value : %.2f\n", totalValue);

        BigDecimal bd1 = new BigDecimal("19.99");
        BigDecimal bd2 = new BigDecimal("5.75");
        BigDecimal bd3 = new BigDecimal("2.40");

        BigDecimal totalBigDecimal = bd1.add(bd2).add(bd3);

        System.out.println("Total Value BigDecimal : " + totalBigDecimal);

        BigDecimal doubleAsBD = BigDecimal.valueOf(totalValue);
        BigDecimal difference = totalBigDecimal.subtract(doubleAsBD);

        System.out.println("Difference : " + difference);

    }
}
