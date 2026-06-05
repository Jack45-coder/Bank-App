package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            System.out.println(choice);

            switch (choice){
                case "0" -> running = false;
            }
        }


    }
}
