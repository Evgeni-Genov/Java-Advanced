package BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Bank> accounts = new ArrayList<>();

        Bank bank;

        while (!input[0].equals("End")) {
            switch (input[0]) {
                case "Create":
                    accounts.add(new Bank());
                    System.out.printf("Account ID%d created%n", accounts.size());

                    break;

                case "Deposit":
                    int id = Integer.parseInt(input[1]);
                    double amount = Double.parseDouble(input[2]);

                    if (accounts.size() - id < 0) {
                        System.out.println("Account does not exist");

                    } else {
                        bank = accounts.get(id - 1);
                        bank.deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    }

                    break;

                case "SetInterest":
                    double interest = Double.parseDouble(input[1]);
                    Bank.setInterestRate(interest);

                    break;

                case "GetInterest":
                    id = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);
                    if (accounts.size() - id < 0) {
                        System.out.println("Account does not exist");

                    } else {
                        bank = accounts.get(id - 1);
                        System.out.printf("%.2f%n", bank.getInterestRate(years));
                    }

                    break;
            }

            input = scanner.nextLine().split("\\s+");
        }

    }
}