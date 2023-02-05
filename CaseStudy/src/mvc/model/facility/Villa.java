package mvc.model.facility;

public class Villa extends Facility{
    private String roomStandard;
    private float poolArea;
    private int numberFloor;

    public Villa(String roomStandard, int numberFloor) {
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public Villa(String roomStandard, float poolArea, int numberFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String serviceName, float usableArea, float rentalCost, int maxPeople, String rentalType, String roomStandard, float poolArea, int numberFloor) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getServiceName(), getUsableArea(),getRentalCost(), getMaxPeople(), getRentalType(), getRoomStandard(),getPoolArea(), getNumberFloor());
    }

    @Override
    public String toString() {
        return "Villa{" +
                "nameService='" + super.getServiceName() + '\'' +
                ", areaUsable=" + super.getUsableArea() +
                ", costRental=" + super.getRentalCost() +
                ", maxPeople=" + super.getMaxPeople() +
                ", typeRental='" + super.getRentalType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
