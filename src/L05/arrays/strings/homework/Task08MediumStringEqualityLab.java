package L05.arrays.strings.homework;

import java.util.Scanner;

public class Task08MediumStringEqualityLab {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Created in the String Pool memory
        String str1 = "Salam";
        String str2 = "Salam";

        // Created in the Heap memory
        String str3 = new String("Salam");
        String str4 = new String("Salam");

        // Literal strings comparision
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));

        // Heap strings comparision
        System.out.println("str3 == str4 : " + (str3 == str4));
        System.out.println("str3.equals(str4) : " + str3.equals(str4));

        // Literal vs Heap comparision
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str2.equals(str4) : " + str2.equals(str4));

        // str4 points to the string pool
        String str5 = str4.intern();

        System.out.println("str1 == str5 : " + (str1 == str5));
        System.out.println("str3 == str5 : " + (str3 == str5));

    }
}
