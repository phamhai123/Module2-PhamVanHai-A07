package test.controllers;

import test.service.BankAccountService;
import test.service.BankAccountServiceImpl;

import java.util.Scanner;

public class BankAccountManagement {
    private static BankAccountService bankAccount = new BankAccountServiceImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---MAIN MENU---\n" +
                    "1. Create Account\n" +
                    "2. Display account list\n" +
                    "3. Delete account\n" +
                    "4. Search account\n" +
                    "5. Exit");
            System.out.println("Please choose:");
            String menuInput = scanner.nextLine();
            switch (menuInput) {
                case "1" :
                    System.out.println("CREATE ACCOUNT");
                    bankAccount.create();
                    break;
                case "2":
                    System.out.println("LIST OF ACCOUNT");
                    bankAccount.display();
                    break;
                case "3":
                    System.out.println("DELETE ACCOUNT");
                    bankAccount.delete();
                    break;
                case "4":
                    System.out.println("SEARCH ACCOUNT");
                    bankAccount.search();
                    break;
                case "5":
                    System.exit(0);
            }
        } while (true);
    }
}
