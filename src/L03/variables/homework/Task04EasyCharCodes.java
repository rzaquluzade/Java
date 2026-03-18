package L03.variables.homework;

public class Task04EasyCharCodes {

    public static void main(String[] args){

         // Dəyişənin elanı
         char letter = 'A',
              number = '7',
              symbol = '-',
              symbol1 = '#';

         // Emoji elani
         String emoji = "\uD83E\uDD13";

         // Tam edede cevirme ve çıxış
         System.out.println("Simvol : " + letter + " -> kodu : " + (int)letter);
         System.out.println("Simvol : " + number + " -> kodu : " + (int)number);
         System.out.println("Simvol : " + symbol + " -> kodu : " + (int)symbol);
         System.out.println("Simvol : " + symbol1 + " -> kodu : " + (int)symbol1);

         // Simvol çıxış
         System.out.println("Emoji : " + emoji);

         // .length() ve .codePointCount(...) muqayise
         System.out.println("Emoji .length() : " + emoji.length() + "\nEmoji .codePointCount(...) : " + emoji.codePointCount(0, emoji.length()));

    }
}
