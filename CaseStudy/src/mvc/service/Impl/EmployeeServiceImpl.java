package mvc.service.Impl;

import mvc.model.person.Employee;
import mvc.service.childservice.EmployeeService;
import mvc.utils.FileRead;
import mvc.utils.FileWrite;
import mvc.utils.InputUntil;
import mvc.validate.RegexLibrary;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService, RegexLibrary {
    private static List<Employee> employees = FileRead.readFromFileEmployee(FILE_EMPLOYEE);
    private static Scanner scanner = new Scanner(System.in);
    private static int latestID = 0;

    static {
        for (Employee in: employees) {
            if (in.getId() > latestID) {
                latestID = in.getId();
            }
        }
    }
    @Override
    public void display() {
        System.out.println("===Employee List===");
        for (Employee employee: employees
             ) {
            System.out.println(employee);
        }
    }

    @Override
    public void create() {
        String name = InputUntil.inputString("Enter name employee:",scanner,NAME_REGEX);
        String birthDate = InputUntil.inputDate("Enter birthday employee:",scanner);
        String sex = InputUntil.inputList("Choose sex:",scanner,"Male,Female");
        double identityCard = InputUntil.inputDouble("Enter identity card:",scanner,IDCARD);
        double phoneNumber = InputUntil.inputDouble("Enter phone number:",scanner,PHONE_NUMBER);
        String email = InputUntil.inputString("Enter email employee:",scanner,EMAIL_REGEX);
        String level = InputUntil.inputList("Enter choose education Level:",scanner,"High School,College,University,After University");
        String position = InputUntil.inputList("Enter choose position:",scanner,"Receptionist,Waiter,Specialist,Supervisor,Manager,Director");
        double salary = InputUntil.inputDouble("Enter salary employee:",scanner);
        employees.add(new Employee(latestID+1,name,birthDate,sex,identityCard,phoneNumber,email,level,position,salary));
        System.out.println("Successfully created a new employee!");
        FileWrite.writeToFileEmployee(employees,FILE_EMPLOYEE);
        latestID++;
    }

    @Override
    public void edit() {
        int count = 0;
        int editId = InputUntil.inputInteger("Enter index of employee need change :",scanner);
        for (int i = 0; i < employees.size() - 1; i++) {
            if (employees.get(i).getId() == editId) {
                String name = InputUntil.inputString("Enter name employee:",scanner,NAME_REGEX);
                String birthDate = InputUntil.inputDate("Enter birthday employee:",scanner);
                String sex = InputUntil.inputList("Choose sex:",scanner,"Male,Female");
                double identityCard = InputUntil.inputDouble("Enter identity card:",scanner,IDCARD);
                double phoneNumber = InputUntil.inputDouble("Enter phone number:",scanner,PHONE_NUMBER);
                String email = InputUntil.inputString("Enter email employee:",scanner,EMAIL_REGEX);
                String level = InputUntil.inputList("Enter choose education Level:",scanner,"High School,College,University,After University");
                String position = InputUntil.inputList("Enter choose position:",scanner,"Receptionist,Waiter,Specialist,Supervisor,Manager,Director");
                double salary = InputUntil.inputDouble("Enter salary employee:",scanner);
                employees.set(i,new Employee(editId,name,birthDate,sex,identityCard,phoneNumber,email,level,position,salary));
                System.out.println("Successfully edit a employee!");
                FileWrite.writeToFileEmployee(employees,FILE_EMPLOYEE);
                count++;
            }
        }
        if(count==0){
            System.out.println("Can't not edit, id=" + editId + " not found in employee list");
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
