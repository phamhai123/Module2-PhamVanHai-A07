package mvc.service;

import mvc.model.Customer;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Customer> lists = new LinkedList<>();

    static {
        lists.add(new Customer(1, "hai", 123, "nam", 132323123, 23432231, "hai@gmail", "vip", "qweqe"));
        lists.add(new Customer(2, "ba", 123, "nam", 1312313123, 234322312, "hai@gmail", "vip", "qweqe"));
        lists.add(new Customer(3, "ba", 123, "nam", 1312313123, 234322312, "hai@gmail", "vip", "qweqe"));
    }

    @Override
    public void display() {
        for (Customer index : lists
        ) {
            System.out.println(index);
        }
    }

    @Override
    public void create() {
        System.out.println("Nhập mã khách hàng :");
        int id = scanner.nextInt();

        System.out.println("Nhập tên khách hàng :");
        String name = scanner.next();
        System.out.println("Nhập ngày sinh khách hàng :");
        int birthDate = scanner.nextInt();
        System.out.println("Nhập giới tính khách hàng :");
        System.out.println("1. Nam \n" +
                "2. Nữ");
        String sex = scanner.next();
        switch (sex) {
            case "1":
                sex = "Nam";
                break;
            case "2":
                sex = "Nữ";
                break;
            default:
                System.out.println("Nhập sai xin nhập lại :");
        }
        System.out.println("Nhâp số CMND :");
        int identityCard = scanner.nextInt();
        System.out.println("Nhập số điện thoại khách hàng :");
        int phoneNumber = scanner.nextInt();
        System.out.println("Nhập email khách hàng :");
        String email = scanner.next();
        System.out.println("Nhập loại khách hàng :");
        String typeGuest = scanner.next();
        System.out.println("Nhập địa chỉ khách hàng :");
        String address = scanner.next();
        lists.add(new Customer(id, name, birthDate, sex, identityCard, phoneNumber, email, typeGuest, address));
    }

    @Override
    public void edit() {
        System.out.println("Nhập địa chỉ khách hàng cần thay đổi:");
        int id = scanner.nextInt();
        for (int i = 0; i < lists.size() - 1; i++) {
            if (lists.get(i).getId() == id) {
                System.out.println("Nhập tên khách hàng :");
                String name = scanner.next();
                System.out.println("Nhập ngày sinh khách hàng :");
                int birthDate = scanner.nextInt();
                System.out.println("Nhập giới tính khách hàng :");
                System.out.println("1. Nam \n" +
                        "2. Nữ");
                String sex = scanner.next();
                switch (sex) {
                    case "1":
                        sex = "Nam";
                        break;
                    case "2":
                        sex = "Nữ";
                        break;
                    default:
                        System.out.println("Nhập sai xin nhập lại :");
                }
                System.out.println("Nhâp số CMND :");
                int identityCard = scanner.nextInt();
                System.out.println("Nhập số điện thoại khách hàng :");
                int phoneNumber = scanner.nextInt();
                System.out.println("Nhập email khách hàng :");
                String email = scanner.next();
                System.out.println("Nhập loại khách hàng :");
                String typeGuest = scanner.next();
                System.out.println("Nhập địa chỉ khách hàng :");
                String address = scanner.next();
                lists.set(i, new Customer(id, name, birthDate, sex, identityCard, phoneNumber, email, typeGuest, address));
            }
        }
    }

//    @Override
//    public void delete() {
//
//    }
}
