package mvc.model;

public class House extends Facility {
    private String roomStandard;
    private int numberFloor;

    public House() {

    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", getServiceName(), getUsableArea(), getRentalCost(), getMaxPeople(), getRentalType(), getRoomStandard(), getNumberFloor());
    }

    public House(String roomStandard, int numberFloor) {
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public House(String serviceName, float usableArea, float rentalCost, int maxPeople, String rentalType, String roomStandard, int numberFloor) {
        super(serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameService='" + super.getServiceName() + '\'' +
                ", areaUsable=" + super.getUsableArea() +
                ", costRental=" + super.getRentalCost() +
                ", maxPeople=" + super.getMaxPeople() +
                ", typeRental='" + super.getRentalType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
