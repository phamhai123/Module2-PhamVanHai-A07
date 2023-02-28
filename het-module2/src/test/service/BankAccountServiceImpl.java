package test.service;


import test.models.BankAccount;
import test.models.PaymentAccount;
import test.models.SavingAccount;
import test.utils.FileReaderAndWriter;
import test.utils.InputUtil;
import test.validation.RegexLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountServiceImpl implements BankAccountService {
    private static List<BankAccount> accountList = new ArrayList<>();
    private static final String DATABASE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\het-module2\\src\\test\\data\\database.csv";
    private static final String COMMA = ",";
    private static int latestId = 0;
    private Scanner scanner = new Scanner(System.in);

    // Get account list from database.csv
    static {
        List<String> content = FileReaderAndWriter.readFile(DATABASE_PATH);
        for (String line : content) {
            String[] attributeValues = line.split(COMMA);
            if (attributeValues.length == 6) {
                PaymentAccount account = new PaymentAccount(Integer.parseInt(attributeValues[0]), attributeValues[1],
                        attributeValues[2], attributeValues[3], attributeValues[4], Double.parseDouble(attributeValues[5]));
                accountList.add(account);
            } else if (attributeValues.length == 8) {
                SavingAccount account = new SavingAccount(Integer.parseInt(attributeValues[0]), attributeValues[1],
                        attributeValues[2], attributeValues[3], Double.parseDouble(attributeValues[4]),
                        attributeValues[5], attributeValues[6], Double.parseDouble(attributeValues[7]));
                accountList.add(account);
            }

            if (Integer.parseInt(attributeValues[0]) > latestId) {
                latestId = Integer.parseInt(attributeValues[0]);
            }
        }
    }

    // create account
    @Override
    public void create() {
        CREATE_MENU:
        do {
            System.out.println("1. Create payment account");
            System.out.println("2. Create saving account");
            System.out.println("3. Back to main menu");
            System.out.println("Please choose:");
            String inputValue = scanner.nextLine();
            switch (inputValue) {
                case "1":
                    createPaymentAccount();
                    break;
                case "2":
                    createSavingAccount();
                    break;
                case "3":
                    break CREATE_MENU;
            }
        } while (true);

    }

    @Override
    public void display() {
        if (accountList.size() == 0){
            System.out.println("Account List: No content");
        } else {
            for (BankAccount account: accountList) {
                System.out.println(account.toString());
            }
        }
    }

    @Override
    public void delete() {
        int count = 0;
        display();
        int deleteId = InputUtil.inputInt("Enter id of account need to be deleted", scanner);
        for (BankAccount account: accountList){
            if (account.getId() == deleteId) {
                accountList.remove(deleteId);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Can't not delete, id=" + deleteId + " not found in account list");
        } else {
            FileReaderAndWriter.writeFile(getContentByString(accountList), DATABASE_PATH);
            System.out.println("Delete account id=" + deleteId + " successfully");
        }
    }

    @Override
    public void search() {
        int count = 0;
        String name = InputUtil.inputString("Enter holder name", scanner);
        for (BankAccount account: accountList){
            if (account.getAccountHolder().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(account.toString());
                count++;
            }
        }
        if (count == 0){
            System.out.println("Account name = "+ name + " not found");
        }
    }

    private void createPaymentAccount() {
        String accountCode = InputUtil.inputString("Input account Code:  ", scanner, RegexLibrary.NUMBER_REGEX);
        String accountHolder = InputUtil.inputString("Input account Holder:  ", scanner, RegexLibrary.NAME_REGEX);
        String createDate = InputUtil.inputString("Input create Date:  ", scanner, RegexLibrary.DATE_REGEX);
        String cardNumber = InputUtil.inputString("Input card Number:  ", scanner, RegexLibrary.NUMBER_REGEX);
        double paymentAmount = InputUtil.inputDouble("Input payment Amount:  ", scanner);
        BankAccount bankAccount = new PaymentAccount(latestId + 1, accountCode, accountHolder, createDate, cardNumber, paymentAmount);
        accountList.add(bankAccount);
        FileReaderAndWriter.writeFile(getContentByString(accountList), DATABASE_PATH);
        ++latestId;
        System.out.println("Create payment account successfully");
    }

    private void createSavingAccount() {
        String accountCode = InputUtil.inputString("Input account Code:  ", scanner, RegexLibrary.NUMBER_REGEX);
        String accountHolder = InputUtil.inputString("Input account Holder:  ", scanner);
        String createDate = InputUtil.inputString("Input create Date:  ", scanner, RegexLibrary.DATE_REGEX);
        double savingAmount = InputUtil.inputDouble("Input saving Amount:  ", scanner);
        String startDate = InputUtil.inputString("Input start Date:  ", scanner, RegexLibrary.DATE_REGEX);
        String endDate = InputUtil.inputString("Input end Date:  ", scanner, RegexLibrary.DATE_REGEX);
        double interestRate = InputUtil.inputDouble("Input interest Rate:  ", scanner);

        BankAccount bankAccount = new SavingAccount(latestId+1, accountCode, accountHolder, createDate, savingAmount, startDate, endDate, interestRate);
        accountList.add(bankAccount);
        FileReaderAndWriter.writeFile(getContentByString(accountList), DATABASE_PATH);
        ++latestId;
        System.out.println("Create payment account successfully");
    }

    private List<String> getContentByString(List<BankAccount> accountList) {
        List<String> result = new ArrayList<>();
        for (BankAccount account: accountList) {
            result.add(account.writeInfoToCsv());
        }
        return result;
    }
}
