package Practic01.Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List <Student> list = new ArrayList<>();
        list.add(new Student("rzaquluzade","rts123"));
        list.add(new Student("elvinatabeyli","elvin1999"));
        list.add(new Student("aslanli.kamil","159.753.258"));

        while (true) {
            try {
                System.out.print("Enter USERNAME : ");
                String username = input.nextLine();

                System.out.print("Enter PASSWORD : ");
                String password = input.nextLine();

                Login.login(list, username, password);
            } catch (UserNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
