package app;

import service.BankService;
import service.BankServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();
        System.out.println("Welcome To Console Bank");
        boolean running = true;
        while (true){
            System.out.println("""
                1) Open Account
                2) Deposit
                3) Withdraw
                4) Transfer
                5) Account Statement
                6) List Accounts
                7) Search Account by Customer Name
                0) Exit
                """);

            System.out.println("CHOOSE");
            String choice = sc.nextLine().trim();
            System.out.println("CHOICE"+ choice);

            switch (choice){
                case "1" -> openAccount(sc, bankService);
                case "2" -> deposit(sc);
                case "3" -> withdraw(sc);
                case "4" -> transfer(sc);
                case "5" -> statement(sc);
                case "6" -> listAccounts(sc);
                case "7" -> searchAccounts(sc);
                case "0" -> running = false;
            }
        }
    }

    private static void openAccount(Scanner sc, BankService bankService) {
        System.out.println("Customer Name: ");
        String name = sc.nextLine().trim();
        System.out.println("Customer Email: ");
        String email = sc.nextLine().trim();
        System.out.println("Account Type(SAVINGS/CURRENT: ");
        String  type = sc.nextLine().trim();
        System.out.println("Initial deposit(optional, blank for 0): ");
        String ammountStr = sc.nextLine().trim();
        Double initial = Double.valueOf(ammountStr);
        bankService.openAccount(name, email, type);


    }

    private static void deposit(Scanner sc) {
    }

    private static void withdraw(Scanner sc) {
    }

    private static void transfer(Scanner sc) {
    }

    private static void statement(Scanner sc) {
    }

    private static void listAccounts(Scanner sc) {
    }

    private static void searchAccounts(Scanner sc) {
    }

}
