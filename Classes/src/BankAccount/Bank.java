package BankAccount;

public class Bank {
    private static int bankAccountCounter = 1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;

    public Bank() {
        this.id = bankAccountCounter++;
    }

    public static void setInterestRate(double interestRate) {
        Bank.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return Bank.interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}

