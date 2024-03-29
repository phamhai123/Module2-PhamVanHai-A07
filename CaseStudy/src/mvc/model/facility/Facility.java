package mvc.model.facility;

public abstract class Facility {
    private String serviceName;
    private float usableArea;
    private float rentalCost;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, float usableArea, float rentalCost, int maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public float getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
    public abstract String getInfo();
    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + serviceName + '\'' +
                ", areaUsable=" + usableArea +
                ", costRental=" + rentalCost +
                ", maxPeople=" + maxPeople +
                ", typeRental='" + rentalType + '\'' +
                '}';
    }
}