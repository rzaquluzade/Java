package l07.oop.fundamental.Task03EasyBankAccount;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        if (balance < 0) {
            System.out.println("There are no funds in the balance.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("No amount.");
        } else {
            balance += amount;
            System.out.println(amount + " deposit. New balance " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("No amount.");
        } else if (amount > balance) {
            System.out.println("There is no required amount on the balance." + balance);
        } else {
            balance -= amount;
            System.out.println("Amount : " + amount + "\nBalance : " + balance);
        }
    }

    public void printSummary() {
        System.out.println("\nACCOUNT SUMMARY");
        System.out.println("Owner : " + owner);
        System.out.println("Balance : " + balance);
    }
}


