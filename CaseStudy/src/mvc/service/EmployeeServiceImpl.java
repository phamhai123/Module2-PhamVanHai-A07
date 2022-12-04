package mvc.service;

import mvc.model.Employee;
import mvc.utils.ReadAndWriteEmployee;
import mvc.utils.RegexPersonUtils;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employees = ReadAndWriteEmployee.readFromFile();
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
        int id = RegexPersonUtils.isId();
        String name = RegexPersonUtils.isName();
        String birthDate = RegexPersonUtils.isBirthDate();
        String sex = RegexPersonUtils.isSex();
        double identityCard = RegexPersonUtils.isIdentityCard();
        double phoneNumber = RegexPersonUtils.isPhoneNumber();
        String email = RegexPersonUtils.isEmail();
        String level = RegexPersonUtils.isLevelEmp();
        String position = RegexPersonUtils.isPosition();
        double salary = RegexPersonUtils.isSalary();
        employees.add(new Employee(id,name,birthDate,sex,identityCard,phoneNumber,email,level,position,salary));
        ReadAndWriteEmployee.writeToFile(employees);
    }

    @Override
    public void edit() {
        System.out.println("Enter index of employee need change :");
        int id = scanner.nextInt();
        for (int i = 0; i < employees.size() - 1; i++) {
            if (employees.get(i).getId() == id) {
                String name = RegexPersonUtils.isName();
                String birthDate = RegexPersonUtils.isBirthDate();
                String sex = RegexPersonUtils.isSex();
                double identityCard = RegexPersonUtils.isIdentityCard();
                double phoneNumber = RegexPersonUtils.isPhoneNumber();
                String email = RegexPersonUtils.isEmail();
                String level = RegexPersonUtils.isLevelEmp();
                String position = RegexPersonUtils.isPosition();
                double salary = RegexPersonUtils.isSalary();
                employees.set(i,new Employee(id,name,birthDate,sex,identityCard,phoneNumber,email,level,position,salary));
                ReadAndWriteEmployee.writeToFile(employees);
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
