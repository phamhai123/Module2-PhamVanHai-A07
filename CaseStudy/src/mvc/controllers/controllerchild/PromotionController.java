package mvc.controllers.controllerchild;

import mvc.controllers.FuramaController;

public class PromotionController {
    public static void isPromotion() {
        int choose = FuramaController.scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Create voucher");
                break;
            case 2:
                System.out.println("Display list customers use service");
                break;
            case 3:
                System.out.println("Display list customers get voucher");
                break;
            case 4:
                System.out.println("Return main menu");
                FuramaController.displayMainMenu();
                break;
        }
        isPromotion();
    }
}
