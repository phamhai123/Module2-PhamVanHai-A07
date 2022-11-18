package mvc.model;

public class Villa extends Facility{
    private String roomStandard;
    private float poolArea;
    private int numberFloor;
    public Villa() {

    }

    public Villa(String roomStandard, int numberFloor) {
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public Villa(String roomStandard, float poolArea, int numberFloor) {
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


}
