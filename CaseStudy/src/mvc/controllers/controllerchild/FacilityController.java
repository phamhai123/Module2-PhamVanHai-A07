package mvc.controllers.controllerchild;

import mvc.controllers.FuramaController;
import mvc.service.Impl.FacilityServiceImpl;

public class FacilityController {
    public static void isFacility() {
        FacilityServiceImpl facility = new FacilityServiceImpl();
        System.out.println("1. Display list facility \n" +
                "2. Add new facility \n" +
                "3. Display list facility maintenance \n" +
                "4. Return main menu");
        System.out.print("Choose:");
        String choose = FuramaController.scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("===Display list facility===");
                facility.display();
                break;
            case "2":
                System.out.println("===Add new facility===");
                facility.create();
                break;
            case "3":
                System.out.println("===Display list facility maintenance===");
                break;
            case "4":
                System.out.println("===Return main menu===");
                FuramaController.displayMainMenu();
                break;
        }
        isFacility();
    }
}
