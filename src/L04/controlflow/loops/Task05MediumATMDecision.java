package L04.controlflow.loops;
import java.util.Scanner;

public class Task05MediumATMDecision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Balansı daxil edin: ");
        double accountBalance = input.nextDouble();

        System.out.println("Balansdan çıxarmaq istədiyiniz məbləği daxil edin: ");
        double withdrwalAmount = input.nextDouble();

        if (accountBalance <= 0) {
            System.out.println("Hesabda vəsait yoxdur.");
        } else if (withdrwalAmount <= 0) {
            System.out.println("Etibarsız məbləğ.");
        } else if (withdrwalAmount > accountBalance) {
            System.out.println("Balans yetərsizdir.");
        } else if (withdrwalAmount > 500) {
            System.out.println("OTP tələb olunur.");
        } else {
            accountBalance -= withdrwalAmount;
            System.out.println("Çıxarış təsdiqləndi.\nYenilənmiş balans: " + accountBalance);
        }

        input.close();
    }
}
