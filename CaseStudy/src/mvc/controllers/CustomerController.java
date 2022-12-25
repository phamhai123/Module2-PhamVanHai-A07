package mvc.controllers;

import mvc.service.CustomerServiceImpl;

public class CustomerController {
    public static void isCustomer() {
        System.out.println("1. Display list customers \n" +
                "2. Add new customer \n" +
                "3. Edit customer \n" +
                "4. Delete customer \n" +
                "5. Return main menu");
        System.out.print("Chosse:");
        String choose = FuramaController.scanner.nextLine();
        CustomerServiceImpl customer = new CustomerServiceImpl();
        switch (choose) {
            case "1":
                System.out.println("===Display list customers===");
                customer.display();
                break;
            case "2":
                System.out.println("===Add new customer===");
                customer.create();
                break;
            case "3":
                System.out.println("===Edit customer===");
                customer.edit();
                break;
            case "4":
                System.out.println("===Delete customer===");
                customer.delete();
                break;
            case "5":
                System.out.println("===Return main menu===");
                FuramaController.displayMainMenu();
                break;
        }
        isCustomer();
    }
}
