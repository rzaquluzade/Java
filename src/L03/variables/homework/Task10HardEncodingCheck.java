package L03.variables.homework;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Task10HardEncodingCheck {

    public static void main(String[] args) {

        String title = "Cafe Bakı \uD83D\uDE00";

        byte[] utf8Bytes = title.getBytes(StandardCharsets.UTF_8);
        byte[] isoBytes = title.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println("Metn : " + title);
        System.out.println("length() : " + title.length());
        System.out.println("codePointCount() : " + title.codePointCount(0,title.length()));

        System.out.println("UTF-8 bayt : " + utf8Bytes.length);
        System.out.println("ISO-8859-1 bayt : " + isoBytes.length);

        System.out.println("UTF-8 baytları : " + Arrays.toString(utf8Bytes));
        System.out.println("ISO-8859-1 baytları : " + Arrays.toString(isoBytes));

        char c1 = title.charAt(4);
        char c2 = title.charAt(6);

        System.out.println("Char 1 : " + c1 + "  kod deyeri : " + (int)c1);
        System.out.println("Char 2 : " + c2 + "  kod deyeri : " + (int)c2);

    }
}
