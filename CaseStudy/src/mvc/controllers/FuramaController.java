package mvc.controllers;

import mvc.model.Customer;
import mvc.service.CustomerServiceImpl;

import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.exit;

public class FuramaController {
    public static void main(String[] args) {
//        displayMainMenu();
//     IsFacility.isFacility();
     IsCustomer.isCustomer();
       //IsEmployee.isEmployee();
    }
    public static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Customer> lists = new LinkedList<>();

    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");

            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Employee Management");
                    IsEmployee.isEmployee();
                    break;
                case "2":
                    System.out.println("Customer Management");
                    IsCustomer.isCustomer();
                    break;

                case "3":
                    System.out.println("Facility Management");
                    IsFacility.isFacility();
                    break;
                case "4":
                    System.out.println("Booking Management");
                    IsBooking.isBooking();
                    break;
                case "5":
                    System.out.println("Promotion Management");
                    IsPromotion.isPromotion();
                    break;
                case "6":
                    exit(0);
                default:
                    System.out.println("Incorrect input, please re-enter!");
            }
        displayMainMenu();
    }
}
