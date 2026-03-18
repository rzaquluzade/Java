package L03.variables.homework;

public class Task02EasyCartTotals {

    public static void main(String[] args) {

        // Məhsulun adı və qiyməti
        int quantityKiwi = 4;
        double priceKiwi = 2.3;

        int quantityaAvocado = 2;
        double priceAvocado = 4.5;

        int quantityPineapple = 1;
        double pricePineaple = 6;

        // Məhsul qiyməti
        double subTotal = quantityKiwi * priceKiwi + quantityaAvocado *
                priceAvocado + quantityPineapple * pricePineaple;

        // Çatdırılma və platforma haqqı
        double deliveryFee = 2, platformFee = 0.5;

        // Total qiymət
        double total = subTotal + deliveryFee +
                platformFee;

        // Kupon endirimi
        final double cuppon_discount = 5;

        total -= cuppon_discount;

        // Çıxış
        System.out.printf("Sub total :  $ %.2f/n", subTotal);
        System.out.printf("\nDelivery fee :  $ %.2f/n", deliveryFee);
        System.out.printf("\nPlatform fee :  $ %.2f/n", platformFee);
        System.out.printf("\nCuppon discount :  $ %.2f/n", cuppon_discount);
        System.out.printf("\nTotal :  $ %.2f/n", total);

    }
}
