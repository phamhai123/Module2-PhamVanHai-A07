package mvc.controllers;

import mvc.service.EmployeeServiceImpl;

public class IsEmployee {
    public static void isEmployee() {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        int choose = FuramaController.scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Display list employees");
                employee.display();
                break;
            case 2:
                System.out.println("Add new employee");
                employee.create();
                break;
            case 3:
                System.out.println("Edit employee");
                employee.edit();
                break;
            case 4:
                System.out.println("Return main menu");
                FuramaController.displayMainMenu();
                break;
        }
        isEmployee();
    }
}
