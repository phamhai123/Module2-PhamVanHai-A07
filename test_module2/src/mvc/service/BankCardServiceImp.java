package mvc.service;

import mvc.controller.ControllerBankCard;
import mvc.models.ATMCard;
import mvc.models.BankCard;
import mvc.models.CreditCard;
import mvc.utils.FileRead;
import mvc.utils.FileWrite;
import mvc.utils.InputUtil;
import mvc.validate.RegexLibrary;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BankCardServiceImp implements BandCardService, RegexLibrary {
    private static Scanner scanner = new Scanner(System.in);
    private static List<BankCard> bankCards = FileRead.readFromFile();

    @Override
    public void createCard() {
        do {
            System.out.println("1. Create ATM card \n" +
                    "2. Create credit card \n" +
                    "3. return menu");
            System.out.println("Please choose");
            switch (scanner.nextLine()) {
                case "1":
                    createATM();
                    break;
                case "2":
                    createCredit();
                    break;
                case "3":
                    ControllerBankCard.controller();
                    break;
            }
        } while (true);
    }

    public void createATM() {
        String numberCard = InputUtil.inputString("Enter number card", scanner, IDCARD);
        String nameCard = InputUtil.inputString("Name by form Pham Van A \n" +"Enter name of card", scanner, NAME_REGEX);
        String CCCD = InputUtil.inputString("Enter CCCD", scanner, IDCARD);
        String address = InputUtil.inputString("Enter address", scanner);
        double balance = InputUtil.inputDouble("Enter numbe balance", scanner);
        bankCards.add(new ATMCard(numberCard, nameCard, CCCD, address, balance));
        FileWrite.writeToFile(bankCards);
    }

    public void createCredit() {
        String numberCard = InputUtil.inputString("Enter number card", scanner, IDCARD);
        String nameCard = InputUtil.inputString("Name by form Pham Van A \n" + " Enter name of card", scanner, NAME_REGEX);
        String CCCD = InputUtil.inputString("Enter CCCD", scanner, IDCARD);
        String address = InputUtil.inputString("Enter address", scanner);
        double debt = InputUtil.inputDouble("Enter debt:", scanner);
        double creditLimit = InputUtil.inputDouble("Enter credit limit", scanner);
        bankCards.add(new CreditCard(numberCard, nameCard, CCCD, address, debt, creditLimit));
        FileWrite.writeToFile(bankCards);
    }

    @Override
    public void display() {
        for (BankCard listCard : bankCards
        ) {
            System.out.println(listCard);
        }
    }

    @Override
    public void payment() {
        double payNumber = InputUtil.inputDouble("Enter the amount to pay :",scanner);
        String numberCard = InputUtil.inputString("Enter number card:",scanner,IDCARD);
        double newPay = 0;
    }

    @Override
    public void depositCard() {

    }

    @Override
    public void searchCard() {
        String search = InputUtil.inputString("Find name card", scanner);
        for (BankCard name : bankCards
        ) {
            if (name.getNameCard().toLowerCase().contains(search.toLowerCase())) {
                System.out.println(name);
            }
        }
    }

    @Override
    public void deleteCard() {
        display();
        int count = 0;
        String ID = InputUtil.inputString("Enter name need delete", scanner);
        for (BankCard delete : bankCards
        ) {
            if (delete.getNumberCard().equals(ID)) {
                bankCards.remove(delete);
                break;
            }
            count++;
        }
        if (count == bankCards.size()) {
            System.out.println("name not found");
        }
    }

    @Override
    public void transfer() {

    }
}
