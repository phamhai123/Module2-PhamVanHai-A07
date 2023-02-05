package mvc.utils;

import mvc.model.booking.Booking;
import mvc.model.facility.Facility;
import mvc.model.person.Customer;
import mvc.model.person.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class FileWrite {
    // Ghi file customer
    public static void writeToFileCustomer(List<Customer> list, String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            for (Customer customer : list) {
                buffer.write(customer.getInfo());
            }
            buffer.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi file Employee
    public static void writeToFileEmployee(List<Employee> list, String filePath) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(filePath);
            bw = new BufferedWriter(fw);
            for (Employee employee : list) {
                bw.write(employee.getInfo());
            }

        } catch (IOException e) {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                System.out.println("File error!");
            }

        }
    }

    // Ghi file Facility
    public static void writeToFileFacility(LinkedHashMap<Facility, Integer> facilityList, String linkFile) {
        try {
            FileWriter fw = new FileWriter(linkFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
                bw.write(entry.getKey().getInfo() + "," + entry.getValue());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Ghi file booking
    public static void writeToFileBooking(TreeSet<Booking> bookings, String linkFile) {
        FileWriter file = null;
        BufferedWriter buffered = null;
        try {
            file = new FileWriter(linkFile);
            buffered = new BufferedWriter(file);
            for (Booking inBooking : bookings) {
                buffered.write(inBooking.getInfo());
                buffered.newLine();
            }
            buffered.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
