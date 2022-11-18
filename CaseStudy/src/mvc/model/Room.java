package mvc.model;

public class Room extends Facility {
    private String freeService;
    public Room() {

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

}
