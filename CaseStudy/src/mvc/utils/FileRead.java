package mvc.utils;

import mvc.model.booking.Booking;
import mvc.model.booking.BookingSort;
import mvc.model.booking.Contract;
import mvc.model.facility.Facility;
import mvc.model.facility.House;
import mvc.model.facility.Room;
import mvc.model.facility.Villa;
import mvc.model.person.Customer;
import mvc.model.person.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileRead {
    private static String filePath;
//  Đọc file Customer
    public static List<Customer> readFromFileCustomer(String filePath) {
        List<Customer> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String temp[];
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                String birthDay = temp[2];
                String sex = temp[3];
                double identityCard = Double.parseDouble(temp[4]);
                double phoneNumber = Double.parseDouble(temp[5]);
                String email = temp[6];
                String type = temp[7];
                String address = temp[8];
                list.add(new Customer(id,name,birthDay,sex,identityCard,phoneNumber,email,type,address));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    // Đọc file employee
    public static List<Employee> readFromFileEmployee(String filePath) {
        List<Employee> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader buffered = new BufferedReader(fileReader);
            String line = "";
            String temp[];
            while ((line = buffered.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                String birthDay = temp[2];
                String sex = temp[3];
                double identityCard = Double.parseDouble(temp[4]);
                double phoneNumber = Double.parseDouble(temp[5]);
                String email = temp[6];
                String level = temp[7];
                String position = temp[8];
                double salary = Double.parseDouble(temp[9]);
                list.add(new Employee(id, name, birthDay, sex, identityCard, phoneNumber, email, level, position, salary));
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
        return list;
    }
    // Đọc file facility
    public static LinkedHashMap<Facility, Integer> readFromFileFacility(String linkFile) {
        LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
        try {
            FileReader file = new FileReader(linkFile);
            BufferedReader buffered = new BufferedReader(file);
            String line = "";
            String temp[];
            String checkName[];
            if ((line = buffered.readLine()) != null) {
                temp = line.split(",");
                checkName = temp[0].split("-");
                if (checkName[0].equals("Villa")) {
                    String numberName = temp[0];
                    float area = Float.parseFloat(temp[1]);
                    float cost = Float.parseFloat(temp[2]);
                    int maxPerson = Integer.parseInt(temp[3]);
                    String type = temp[4];
                    String standard = temp[5];
                    float poolArea = Float.parseFloat(temp[6]);
                    int floor = Integer.parseInt(temp[7]);
                    int numberRented = Integer.parseInt(temp[8]);
                    facilityList.put(new Villa(numberName,area,cost,maxPerson,type,standard,poolArea,floor),numberRented);
                } else if (checkName[0].equals("House")) {
                    String numberName = temp[0];
                    float area = Float.parseFloat(temp[1]);
                    float cost = Float.parseFloat(temp[2]);
                    int maxPerson = Integer.parseInt(temp[3]);
                    String type = temp[4];
                    String standard = temp[5];
                    int floor = Integer.parseInt(temp[6]);
                    int numberRented = Integer.parseInt(temp[7]);
                    facilityList.put(new House(numberName,area,cost,maxPerson,type,standard,floor),numberRented);
                } else if (checkName[0].equals("Room")) {
                    String numberName = temp[0];
                    float area = Float.parseFloat(temp[1]);
                    float cost = Float.parseFloat(temp[2]);
                    int maxPerson = Integer.parseInt(temp[3]);
                    String type = temp[4];
                    String freeService = temp[5];
                    int numberRented = Integer.parseInt(temp[6]);
                    facilityList.put(new Room(numberName,area,cost,maxPerson,type,freeService),numberRented);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return facilityList;
    }
    // Đọc file booking
    public static TreeSet<Booking> readFromFileBooking(String linkFile) {
        TreeSet<Booking> bookingList = new TreeSet<>(new BookingSort());
        try {
            FileReader fileWriter = new FileReader(linkFile);
            BufferedReader bufferedReader = new BufferedReader(fileWriter);
            String line = "";
            String temp[];
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int bookingId = Integer.parseInt(temp[0]);
                String starDate = temp[1];
                String endDate = temp[2];
                String customerId = temp[3];
                String nameServiceId  = temp[4];
                String typeService = temp[5];
                String voucher = temp[6];
                bookingList.add(new Booking(bookingId,starDate,endDate,customerId,nameServiceId,typeService,voucher));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bookingList;
    }
    public static LinkedHashSet<Contract> readFromFileContract(String filePath) {
        LinkedHashSet<Contract> listContract = new LinkedHashSet<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String temp[];
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                int idContract = Integer.parseInt(temp[0]);
                String idBooking = temp[1];
                double deposit = Double.parseDouble(temp[2]);
                double sumPay = Double.parseDouble(temp[3]);
                String idCustomer = temp[4];
                listContract.add(new Contract(idContract,idBooking,deposit,sumPay,idCustomer));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listContract;
    }
}
