package mvc.model.booking;

import mvc.validate.RegexLibrary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Booking implements RegexLibrary {
    private int bookingID;
    private LocalDate startDate;
    private LocalDate lateDate;
    private String customerID;
    private String nameService;
    private String typeService;
    private String voucher;

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
    private Booking() {
    }

    public Booking(int bookingID, LocalDate startDate, LocalDate lateDate, String customerID, String nameService, String typeService, String voucher) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.lateDate = lateDate;
        this.customerID = customerID;
        this.nameService = nameService;
        this.typeService = typeService;
        this.voucher = voucher;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getLateDate() {
        return lateDate;
    }

    public void setLateDate(LocalDate lateDate) {
        this.lateDate = lateDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getInfo(){
       return String.format("%s,%s,%s,%s,%s,%s,%s",bookingID,startDate,lateDate,customerID,nameService,typeService,voucher);
    }

    @Override
    public String
    toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + lateDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                ", voucher='" + voucher + '\'' +
                '}';
    }
}
