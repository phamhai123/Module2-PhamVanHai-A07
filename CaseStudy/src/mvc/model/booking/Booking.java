package mvc.model.booking;

import java.util.Date;

public class Booking {
    private int bookingID;
    private String startDate;
    private String endDate;
    private String customerID;
    private String nameService;
    private String typeService;
    private Booking() {

    }

    public Booking(int idBooking, String startDate, String endDate, String customerID, String nameService, String typeService) {
        this.bookingID = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerID = customerID;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public int getIdBooking() {
        return bookingID;
    }

    public void setIdBooking(int idBooking) {
        this.bookingID = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
       return String.format("%s,%s,%s,%s,%s,%s",bookingID,startDate,endDate,customerID,nameService,typeService);
    }
    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
