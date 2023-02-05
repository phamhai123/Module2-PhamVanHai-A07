package unnecessary;

import mvc.model.booking.Booking;
import mvc.model.booking.BookingSort;

import java.io.*;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    public static void writeToFile(TreeSet<Booking> bookings, String linkFile) {
        FileWriter file = null;
        BufferedWriter buffered = null;
        try {
            file = new FileWriter(linkFile);
            buffered = new BufferedWriter(file);
            for (Booking inBooking : bookings) {
                buffered.write(inBooking.getInfo());
            }
            buffered.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static TreeSet<Booking> readFromFile(String linkFile) {
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
                bookingList.add(new Booking(bookingId,starDate,endDate,customerId,nameServiceId,typeService));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bookingList;
    }
}
