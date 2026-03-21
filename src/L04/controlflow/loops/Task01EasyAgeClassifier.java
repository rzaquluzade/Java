package L04.controlflow.loops;
import java.util.Scanner;

public class Task01EasyAgeClassifier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Consoledan dəyər almaq
        System.out.println("----- YAŞINIZI DAXİL EDİN -----");
        System.out.printf("              ");
        int age = input.nextInt();

        // Dəyərə uyğun alınan nəticə
        if (age == 0)
            System.out.println("Etibarsız giriş");
        else if (age > 0 && age <= 12)
            System.out.println("           << UŞAQ >> ");
        else if (age >= 13 && age <= 17)
            System.out.println("         << YENİYETMƏ >> ");
        else if (age >= 18 && age <= 64)
            System.out.println("         << BÖYÜKLƏR >> ");
        else
            System.out.println("         << BÖYÜK >> ");

    }
}
