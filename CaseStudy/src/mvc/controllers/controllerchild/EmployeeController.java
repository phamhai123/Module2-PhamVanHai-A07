package mvc.controllers.controllerchild;

import mvc.controllers.FuramaController;
import mvc.service.EmployeeServiceImpl;

public class EmployeeController {
    public static void isEmployee() {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        System.out.println("1. Display list employees \n"+
                "2. Add new employee \n" +
                "3. Edit employe \n" +
                "4. Return main menu" );
        System.out.print("Choose:");
        String choose = FuramaController.scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("===Display list employees===");
                employee.display();
                break;
            case "2":
                System.out.println("===Add new employee===");
                employee.create();
                break;
            case "3":
                System.out.println("===Edit employee===");
                employee.edit();
                break;
            case "4":
                System.out.println("===Return main menu==");
                FuramaController.displayMainMenu();
                break;
        }
        isEmployee();
    }
}
