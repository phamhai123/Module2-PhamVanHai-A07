package mvc.service.Impl;

import mvc.model.booking.Booking;
import mvc.service.childservice.BookingService;
import mvc.service.childservice.CustomerService;
import mvc.service.childservice.FacilityService;
import mvc.utils.FileRead;
import mvc.utils.FileWrite;
import mvc.utils.InputUntil;
import mvc.validate.RegexLibrary;

import java.time.LocalDate;
import java.util.Date;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService, RegexLibrary {
    private static TreeSet<Booking> bookingList = FileRead.readFromFileBooking(FILE_BOOKING);
    private static CustomerService customerService = new CustomerServiceImpl();
    private static FacilityService facilityService = new FacilityServiceImpl();
    @Override
    public void display() {
        for (Booking booking: bookingList
             ) {
            System.out.println(booking);
        }
    }
    @Override
    public void addBooking() {
        int bookingID = InputUntil.inputInteger("Enter id booking:",scanner);
        Date starDate = InputUntil.inputDate("Enter star day:",scanner);
        Date endDate = InputUntil.compareDate("Enter end day:",starDate,scanner);
        customerService.display();
        String customerId = CustomerServiceImpl.checkIdCustomer();
        facilityService.display();
        String nameServiceId  = FacilityServiceImpl.checkIdFacility();
        String[] listName = nameServiceId.split("-");
        String typeService = listName[0];
        String voucher = "none";
        bookingList.add(new Booking(bookingID,starDate,endDate,customerId,nameServiceId,typeService,voucher));
        FileWrite.writeToFileBooking(bookingList,FILE_BOOKING);
    }

}
