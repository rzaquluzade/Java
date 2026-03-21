package L04.controlflow.loops;
import java.util.Scanner;

public class Task02EasyDayTypeSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Consoledan dəyər almaq
        System.out.println("----- HƏFTƏNİN GÜNÜNÜ DAXİL EDİN -----");
        System.out.printf("                  ");
        int day = input.nextInt();

        // Dəyərə uyğun həftənin günləri
        switch (day) {
            case 1 -> System.out.println("           /// MONDAY \\\\\\ ");
            case 2 -> System.out.println("           /// TUESDAY \\\\\\ ");
            case 3 -> System.out.println("           /// WEDNESDAY \\\\\\ ");
            case 4 -> System.out.println("           /// THURSDAY \\\\\\ ");
            case 5 -> System.out.println("           /// FRIDAY \\\\\\ ");
            case 6 -> System.out.println("           /// SATURDAY \\\\\\ ");
            case 7 -> System.out.println("           /// SUNDAY \\\\\\ ");
            default -> System.out.println("           Dəyər yanlışdır");
        };

        if (day >= 1 && day <= 5) {
            System.out.println("           \\\\\\ WEEKDAY ///");
        } else if (day == 6 || day == 7) {
            System.out.println("           \\\\\\ WEEKEND ///");
        } else {
            System.out.println("           Dəyər yanlışdır");
        }

    }
}
