package L04.controlflow.loops;
import java.util.Scanner;

public class Task04EasyPinValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int PIN_CODE = 1357;

        int enteredPIN, attempts = 0;

        do {
            System.out.println("PINI daxil edin: ");
            enteredPIN = input.nextInt();

            attempts++;

            if (enteredPIN == PIN_CODE) {
                System.out.println("Giriş uğurludur.");
            } else {
                System.out.println("Yanlış PIN.");
            }
        } while (attempts < 3);

        if (enteredPIN != PIN_CODE) {
            System.out.println("Hesab bloklandı.");
        }
        input.close();
    }
}
