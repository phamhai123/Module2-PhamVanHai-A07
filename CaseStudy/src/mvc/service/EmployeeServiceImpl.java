package mvc.service;

import mvc.model.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static LinkedList<Employee> employees = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Employee employee: employees
             ) {
            System.out.println(employee);
        }
    }

    @Override
    public void create() {
        System.out.println("Nhập mã nhân viên :");
        int id = scanner.nextInt();
        System.out.println("Nhập tên nhân viêm :");
        String name = scanner.next();
        System.out.println("Nhập ngày nhân viên :");
        int birthDate = scanner.nextInt();
        System.out.println("Nhập giới tính nhân viên :");
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
        System.out.println("Nhập số điện thoại nhân viên :");
        int phoneNumber = scanner.nextInt();
        System.out.println("Nhập email nhân viên :");
        String email = scanner.next();
        System.out.println("Nhập trình độ nhân viên :");
        String level = scanner.next();
        System.out.println("Nhập vị trí :");
        String position = scanner.next();
        System.out.println("Nhập mức lương :");
        double salary = scanner.nextDouble();
        employees.add(new Employee(id,name,birthDate,sex,identityCard,phoneNumber,email,level,position,salary));
    }

    @Override
    public void edit() {
        System.out.println("Nhập địa chỉ khách hàng cần thay đổi:");
        int id = scanner.nextInt();
        for (int i = 0; i < employees.size() - 1; i++) {
            if (employees.get(i).getId() == id) {
                System.out.println("Nhập tên nhân viêm :");
                String name = scanner.next();
                System.out.println("Nhập ngày nhân viên :");
                int birthDate = scanner.nextInt();
                System.out.println("Nhập giới tính nhân viên :");
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
                System.out.println("Nhập số điện thoại nhân viên :");
                int phoneNumber = scanner.nextInt();
                System.out.println("Nhập email nhân viên :");
                String email = scanner.next();
                System.out.println("Nhập trình độ nhân viên :");
                String level = scanner.next();
                System.out.println("Nhập vị trí :");
                String position = scanner.next();
                System.out.println("Nhập mức lương :");
                double salary = scanner.nextDouble();
                employees.set(i,new Employee(id,name,birthDate,sex,identityCard,phoneNumber,email,level,position,salary));
            }
        }
    }

//    @Override
//    public void create() {
//
//    }
//
//    @Override
//    public void edit() {
//
//    }
//
//    @Override
//    public void delete() {
//
//    }

}
