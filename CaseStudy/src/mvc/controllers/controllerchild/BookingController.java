package mvc.controllers.controllerchild;

import mvc.controllers.FuramaController;
import mvc.service.childservice.BookingService;
import mvc.service.Impl.BookingServiceImpl;

public class BookingController {

    public static void isBooking() {
        BookingService bookingService = new BookingServiceImpl();
        System.out.println("1. Display list booking \n" + "2. Add new booking \n" + "3. Create new contracts \n" + "4. Display list contracts \n" + "5. Edit contracts \n" + "6. Return main menu");
        System.out.print("Choose:");
        String choose = FuramaController.scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("Display list booking");
                bookingService.display();
                break;
            case "2":
                System.out.println("Add new booking");
                bookingService.addBooking();
                break;
            case "3":
                System.out.println("Create new contracts");
                break;
            case "4":
                System.out.println("Display list contracts");
                break;
            case "5":
                System.out.println("Edit contracts");
                break;
            case "6":
                System.out.println("Return main menu");
                FacilityController.isFacility();
        }
        isBooking();
    }

    public static void main(String[] args) {
        isBooking();
    }
}
