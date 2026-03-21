package L04.controlflow.loops;
import java.util.Scanner;

public class Task03EasyRangePrinter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print
                ("Başlanğıc ədədini daxil edin : ");
        int start = input.nextInt();

        System.out.print("Soluq ədədini daxil edin : ");
        int end = input.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Diapozondaki ededler : ");
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " -> 3-ə bölünür");
            } else {
                System.out.println(i);
            }

            sum += i;
        }

        System.out.println("Ümumi cəm : " + sum);
    }
}
