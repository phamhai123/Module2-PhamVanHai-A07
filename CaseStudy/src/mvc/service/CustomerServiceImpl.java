package mvc.service;

import mvc.model.Customer;
import mvc.utils.InputUntil;
import mvc.utils.ReadAndWriteCustomer;
import mvc.validate.RegexLibrary;

import java.util.*;

public class CustomerServiceImpl implements CustomerService, RegexLibrary {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> lists = ReadAndWriteCustomer.readFromFile();
    private static int latestID = 0;

    static {
        for (Customer in : lists) {
            if (in.getId() > latestID) {
                latestID = in.getId();
            }
        }
    }

    @Override
    public void display() {
        System.out.println("===Customer List===");
        for (Customer index : lists
        ) {
            System.out.println(index);
        }
    }

    @Override
    public void create() {
        String name = InputUntil.inputString("Enter customer name:", scanner, NAME_VN_REGEX);
        String birthDate = InputUntil.inputDate("Enter birth day:", scanner);
        String sex = InputUntil.inputList("Choose sex:", scanner, "Male,Female");
        double identityCard = InputUntil.inputDouble("Enter identity card:", scanner, IDCARD);
        double phoneNumber = InputUntil.inputDouble("Enter phone number:", scanner, PHONE_NUMBER);
        String email = InputUntil.inputString("Enter email:", scanner, EMAIL_REGEX);
        String typeGuest = InputUntil.inputList("Enter type guest:", scanner, "Diamond,Platinum,Gold,Silver,Member");
        String address = InputUntil.inputString("Enter address", scanner);
        lists.add(new Customer(latestID + 1, name, birthDate, sex, identityCard, phoneNumber, email, typeGuest, address));
        System.out.println("Successful create!");
        ReadAndWriteCustomer.writeToFile(lists);
        ++latestID;
    }

    @Override
    public void edit() {
        display();
        int count = 0;
        int editId = InputUntil.inputInteger("Enter the customer's address to change:", scanner);
        for (int i = 0; i < lists.size() - 1; i++) {
            if (lists.get(i).getId() == editId) {
                String name = InputUntil.inputString("Enter customer name:", scanner, NAME_VN_REGEX);
                String birthDate = InputUntil.inputDate("Enter birth day:", scanner);
                String sex = InputUntil.inputList("Choose sex:", scanner, "Male,Female");
                double identityCard = InputUntil.inputDouble("Enter identity card:", scanner, IDCARD);
                double phoneNumber = InputUntil.inputDouble("Enter phone number:", scanner, PHONE_NUMBER);
                String email = InputUntil.inputString("Enter email:", scanner, EMAIL_REGEX);
                String typeGuest = InputUntil.inputList("Enter type guest:", scanner, "Diamond,Platinum,Gold,Silver,Member");
                String address = InputUntil.inputString("Enter address", scanner);
                lists.set(i, new Customer(editId, name, birthDate, sex, identityCard, phoneNumber, email, typeGuest, address));
                System.out.println("Successful edit!");
                ReadAndWriteCustomer.writeToFile(lists);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Can't not edit, id=" + editId + " not found in customer list");
        }
    }

    @Override
    public void delete() {
        display();
        int count = 0;
        int deleteId = InputUntil.inputInteger("Enter the customer's address to delete:", scanner);
        for (Customer customer : lists) {
            if (customer.getId() == deleteId) {
                OUT:
                do {
                    count++;
                    System.out.println("Do you want to delete!");
                    System.out.println("1. Yes\n" + "2. No");
                    System.out.print("Choose:");
                    switch (scanner.nextLine()) {
                        case "1":
                            lists.remove(deleteId);
                            System.out.println("Successful delete!");
                            ReadAndWriteCustomer.writeToFile(lists);
                            break OUT;
                        case "2":
                            break OUT;
                        default:
                            System.out.println("Please re-enter!");
                    }
                } while (true);
            }
        }
        if (count == 0) {
            System.out.println("Can't not delete, id=" + deleteId + " not found in customer list");
        }

    }

}
