package mvc.service;

import mvc.model.Customer;
import mvc.utils.ReadAndWriteCustomer;
import mvc.validate.RegexPersonUtils;
import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> lists = ReadAndWriteCustomer.readFromFile();
    @Override
    public void display() {
        for (Customer index : lists
        ) {
            System.out.println(index);
        }
    }

    @Override
    public void create(){
        int id = Integer.parseInt(RegexPersonUtils.isId());
        String name = RegexPersonUtils.isName();
        String birthDate = RegexPersonUtils.isBirthDate();
        String sex = RegexPersonUtils.isSex();
        double identityCard = Double.parseDouble(RegexPersonUtils.isIdentityCard());
        double phoneNumber = Double.parseDouble(RegexPersonUtils.isPhoneNumber());
        String email = RegexPersonUtils.isEmail();
        String typeGuest = RegexPersonUtils.isTypeGuest();
        String address = RegexPersonUtils.isAddress();
        lists.add(new Customer(id, name, birthDate, sex, identityCard, phoneNumber, email, typeGuest, address));
        ReadAndWriteCustomer.writeToFile(lists);
    }

    @Override
    public void edit(){

        System.out.println("Nhập địa chỉ khách hàng cần thay đổi:");
        int index = scanner.nextInt();
        for (int i = 0; i < lists.size() - 1; i++) {
            if (lists.get(i).getId() == index) {
                int id = Integer.parseInt(RegexPersonUtils.isId());
                String name = RegexPersonUtils.isName();
                String birthDate = RegexPersonUtils.isBirthDate();
                String sex = RegexPersonUtils.isSex();
                double identityCard = Double.parseDouble(RegexPersonUtils.isIdentityCard());
                double phoneNumber = Double.parseDouble(RegexPersonUtils.isPhoneNumber());
                String email = RegexPersonUtils.isEmail();
                String typeGuest = RegexPersonUtils.isTypeGuest();
                String address = RegexPersonUtils.isAddress();
                lists.set(i, new Customer(id, name, birthDate, sex, identityCard, phoneNumber, email, typeGuest, address));
                ReadAndWriteCustomer.writeToFile(lists);
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập địa chỉ khách hàng cần xoa:");
        int index = scanner.nextInt();
        for (int i = 0; i < lists.size() - 1; i++) {
            if (lists.get(i).getId() == index) {
                lists.remove(i);
                ReadAndWriteCustomer.writeToFile(lists);
            }
        }
    }

//    @Override
//    public void delete() {
//
//    }
}
