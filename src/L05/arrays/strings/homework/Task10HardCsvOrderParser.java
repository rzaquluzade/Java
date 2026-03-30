package L05.arrays.strings.homework;

import java.util.Scanner;

public class Task10HardCsvOrderParser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String string = "apple:2,banana:5,orange:3";
        System.out.println(string);

        String[] lists = string.split(",");

        String[] products = new String[lists.length];
        int[] quantity = new int[lists.length];

        for (int i = 0; i < lists.length; i++) {
            String [] parts = lists[i].split(":");
            products[i] = parts[0];
            quantity[i] = Integer.parseInt(parts[1]);
        }

        int totalQuantity = 0;
        for (int q : quantity) {
            totalQuantity += q;
        }

        for (int i = 0; i < products.length; i++) {
            System.out.println(String.format("%-10s : %d", products[i], quantity[i]));
        }
            System.out.println(String.format("Total Quantity : %d", totalQuantity));

    }
}