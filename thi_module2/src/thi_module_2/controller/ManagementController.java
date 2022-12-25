package thi_module_2.controller;

import thi_module_2.services.AccountServiceImp;

import java.util.Scanner;

public class ManagementController {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        manage();
    }
    public static void manage() {
        AccountServiceImp account = new AccountServiceImp();
            System.out.println("1. Create \n" +
                    "2. Display \n" +
                    "3. Delete \n" +
                    "4. Find \n");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("1. Create payment \n" +
                            "2. Create Saving");
                    account.addNew();
                    break;
                case "2":
                    account.display();
                    break;
                case "3":
                    account.delete();
                    break;
                case "4":
                    account.find();
                    break;
                default:
                    System.out.println("");
        }
    }
}
