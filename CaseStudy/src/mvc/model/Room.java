package mvc.model;

public class Room extends Facility {
    private String freeService;
    public Room() {

    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s", getServiceName(), getUsableArea(), getRentalCost(), getMaxPeople(), getRentalType(), getFreeService());
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, float usableArea, float rentalCost, int maxPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameService='" + super.getServiceName() + '\'' +
                ", areaUsable=" + super.getUsableArea() +
                ", costRental=" + super.getRentalCost() +
                ", maxPeople=" + super.getMaxPeople() +
                ", typeRental='" + super.getRentalType() + '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
