package mvc.controllers;

import mvc.model.Customer;

import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.exit;

public class FuramaController {
    public static void main(String[] args) {
//        displayMainMenu();
//     IsFacility.isFacility();
//        CustomerController.isCustomer();
        EmployeeController.isEmployee();
    }

    public static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Customer> lists = new LinkedList<>();

    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        System.out.print("Choose:");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                System.out.println("===Employee Management===");
                EmployeeController.isEmployee();
                break;
            case "2":
                System.out.println("===Customer Management===");
                CustomerController.isCustomer();
                break;

            case "3":
                System.out.println("===Facility Management===");
                FacilityController.isFacility();
                break;
            case "4":
                System.out.println("===Booking Management===");
                BookingController.isBooking();
                break;
            case "5":
                System.out.println("===Promotion Management===");
                PromotionController.isPromotion();
                break;
            case "6":
                exit(0);
            default:
                System.out.println("Incorrect input, please re-enter!");
        }
        displayMainMenu();
    }
}
