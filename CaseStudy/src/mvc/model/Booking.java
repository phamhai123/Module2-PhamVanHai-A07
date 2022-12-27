package mvc.model;

import java.util.Date;

public class Booking {
    private int idBooking;
    private String startDate;
    private String endDate;
    private String nameService;
    private String typeService;
    private Booking() {

    }

    public Booking(int idBooking, String startDate, String endDate, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
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

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
