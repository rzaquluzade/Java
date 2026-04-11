package l07.oop.fundamental.Task03EasyBankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account owner name : ");
        String owner = input.nextLine();

        System.out.print("Enter balance : ");
        double balance = input.nextDouble();



        BankAccount account = new BankAccount(owner, balance);

        account.deposit(500);
        System.out.println();
        account.withdraw(200);
        System.out.println();
        account.withdraw(1000);
        System.out.println();
        account.deposit(-20);
        System.out.println();
        account.printSummary();

        input.close();
    }
}
