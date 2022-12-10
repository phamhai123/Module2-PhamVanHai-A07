package mvc.controllers;

import mvc.service.CustomerServiceImpl;

public class IsCustomer {
    public static void isCustomer() {
        String choose = FuramaController.scanner.nextLine();
        CustomerServiceImpl customer = new CustomerServiceImpl();
        switch (choose) {
            case "1":
                System.out.println("Display list customers");
                customer.display();
                break;
            case "2":
                System.out.println("Add new customer");
                customer.create();
                break;
            case "3":
                System.out.println("Edit customer");
                customer.edit();
                break;
            case "4":
                System.out.println("Delete customer");
                customer.delete();
                break;
            case "5":
                System.out.println("Return main menu");
                FuramaController.displayMainMenu();
                break;
        }
        isCustomer();
    }
}
