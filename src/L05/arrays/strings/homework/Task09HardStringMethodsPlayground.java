package L05.arrays.strings.homework;

import java.util.Scanner;

public class Task09HardStringMethodsPlayground {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Texnoera Academy Lessons");
        String text = "Texnoera Academy Lessons";

        System.out.println(".length() : " + text.length());
        System.out.println(".charAt(index 2) : " + text.charAt(2));
        System.out.println(".indexOf('A') : " + text.indexOf('A'));
        System.out.println(".substring(index 17) : " + text.substring(17) + " vs .substring(index 10, index 16) : " + text.substring(10, 16));
        System.out.println(".toUpperCase() : " + text.toUpperCase());
        System.out.println(".toLowerCase() : " + text.toLowerCase());
        System.out.println(".startWith(\"Tex\") : " + text.startsWith("Tex"));
        System.out.println(".endWith(\"sons\") : " + text.endsWith("sons"));
        System.out.println("Yes contains(\"Academy\") : " + text.contains("Academy") + " - No contains(\"C++\") ; " + text.contains("C++"));
        System.out.println(".replace(' ', ' ') : " + text.replace(' ', ','));
        System.out.println(".isEmpty() : " + text.isEmpty());
        System.out.println(".isBlank() : " + text.isBlank());
        System.out.println(".trim() : " + text.trim());
        System.out.println(".strip() : " + text.strip());

    }
}