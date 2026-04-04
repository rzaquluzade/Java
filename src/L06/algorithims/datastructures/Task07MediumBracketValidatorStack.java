package L06.algorithims.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class Task07MediumBracketValidatorStack {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char end = stack.pop();
                if ((c == '(' && end != ')') || (c == '[' && end != ']') || (c == '{' && end != ')')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string : ");
        String line = input.nextLine();

        System.out.println("Correcness : " + isValid(line));

        input.close();
    }
}
