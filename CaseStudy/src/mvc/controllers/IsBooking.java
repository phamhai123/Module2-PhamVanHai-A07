package mvc.controllers;

public class IsBooking {


    public static void isBooking() {
        String choose = FuramaController.scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("Display list booking");
            case "2":
                System.out.println("Add new booking");
            case "3":
                System.out.println("Create new contracts");
            case "4":
                System.out.println("Display list contracts");
            case "5":
                System.out.println("Edit contracts");
            case "6":
                System.out.println("Return main menu");
        }
    }

}
