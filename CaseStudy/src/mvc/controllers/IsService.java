package mvc.controllers;

import mvc.service.FacilityServiceImpl;

public class IsService{
    public static void isService() {
        FacilityServiceImpl facility = new FacilityServiceImpl();
        System.out.println("1. Add Villa \n" +
                "2. Add House \n" +
                "3. Add Room \n" +
                "4. Back to menu");
        int choose = FuramaController.scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("villa");
                facility.addVilla();
                break;
            case 2:
                System.out.println("House");
                facility.addHouse();
                break;
            case 3:
                System.out.println("Room");
                facility.addRoom();
                break;
            case 4:
                System.out.println("Back to menu");
                IsFacility.isFacility();
                break;
        }
        isService();
    }
}
