package mvc.controller;

import mvc.service.BandCardService;
import mvc.service.BankCardServiceImp;

import java.util.Scanner;

public class ControllerBankCard {
    public static void main(String[] args) {
        controller();
    }
    public static void controller(){
        Scanner scanner = new Scanner(System.in);
        BandCardService bandCardService = new BankCardServiceImp();
        do {
            System.out.println("1. Card registration \n" +
                    "2. Display all card \n" +
                    "4. Payment by card \n" +
                    "5. Deposit money into the card \n" +
                    "6. Find card \n" +
                    "7. Delete card \n" +
                    "8. Exit the program");
            System.out.println("Please choose:");
            switch (scanner.nextLine()){
                case "1":
                    bandCardService.createCard();
                    break;
                case "2":
                    bandCardService.display();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    bandCardService.searchCard();
                    break;
                case "7":
                    bandCardService.deleteCard();
                    break;
                case "8":
                    break;
            }
        }while (true);
    }
}
