package mvc.controllers;

public class IsPromotion {
    public static void isPromotion() {
        int choose = FuramaController.scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Display list customers use service");
            case 2:
                System.out.println("Display list customers get voucher");
            case 3:
                System.out.println("Return main menu");
        }
    }
}
