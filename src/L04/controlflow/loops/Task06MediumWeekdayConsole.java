package L04.controlflow.loops;
import java.util.Scanner;

public class Task06MediumWeekdayConsole {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int VALUE = 0;

        System.out.println("------< HƏFTƏNİN GÜNÜNÜ QEYD EDİN >------");
        while (true) {
            System.out.print("                    ");
            int week_day = input.nextInt();

            if (week_day == 0) {
                break;
            }

            switch (week_day) {
                case 1 -> {
                    System.out.println("     <<< MONDAY -- BAZAR ERTƏSİ >>>");
                    VALUE++;
                }
                case 2 -> {
                    System.out.println("    <<< TUESDAY -- ÇƏRŞƏNBƏ AXŞAMI >>>");
                    VALUE++;
                }
                case 3 -> {
                    System.out.println("      <<< WEDNESDAY -- ÇƏRŞƏNBƏ >>>");
                    VALUE++;
                }
                case 4 -> {
                    System.out.println("     <<< THURSDAY -- CÜMƏ AXŞAMI >>>");
                    VALUE++;
                }
                case 5 -> {
                    System.out.println("          <<< FRIDAY -- CÜMƏ >>>");
                    VALUE++;
                }
                case 6 -> {
                    System.out.println("         <<< SATURDAY -- ŞƏNBƏ >>>");
                    VALUE++;
                }
                case 7 -> {
                    System.out.println("          <<< SANDAY -- BAZAR >>>");
                    VALUE++;
                }
                default -> {
                    System.out.println("      Yanlış giriş. Yenidən cəhd edin.");
                    continue;
                }
            }
        }
        System.out.println("Etibarlı gün axtarışlarının sayı: " + VALUE);
        input.close();
    }
}
