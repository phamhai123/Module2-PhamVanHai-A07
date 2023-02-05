package mvc.service.Impl;

import mvc.model.facility.Facility;
import mvc.model.facility.House;
import mvc.model.facility.Room;
import mvc.model.facility.Villa;
import mvc.service.childservice.FacilityService;
import mvc.utils.FileRead;
import mvc.utils.FileWrite;
import mvc.utils.InputUntil;
import unnecessary.ReadAndWriteFacility;
import mvc.validate.RegexLibrary;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService, RegexLibrary {
    private static LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static LinkedHashMap<Facility, Integer> villaList = FileRead.readFromFileFacility(FILE_VILLA);
    private static LinkedHashMap<Facility, Integer> houseList = FileRead.readFromFileFacility(FILE_HOUSE);
    private static LinkedHashMap<Facility, Integer> roomList = FileRead.readFromFileFacility(FILE_ROOM);
    private static Scanner scanner = new Scanner(System.in);
    static {
        facilityMap.putAll(villaList);
        facilityMap.putAll(houseList);
        facilityMap.putAll(roomList);
    }
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facility : facilityMap.entrySet()
        ) {
            System.out.println("Service " + facility.getKey() + "\n number of times rented: " + facility.getValue());
        }
    }
    @Override
    public void displayMaintenance() {
        for (Facility maintain: facilityMap.keySet()) {
            if(facilityMap.get(maintain)>=5){
                System.out.println(maintain);
            }
        }
    }
    @Override
    public void create() {
        OUT:
        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu");
            System.out.print("Choose:");
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("===VILLA===");
                    addVilla();
                    break;
                case "2":
                    System.out.println("===HOUSE===");
                    addHouse();
                    break;
                case "3":
                    System.out.println("===ROOM===");
                    addRoom();
                    break;
                case "4":
                    break OUT;
            }
        } while (true);
    }

    @Override
    public void edit() {

    }

    public void addVilla() {
        String numberName = InputUntil.inputString("Enter number Name ID", scanner, ID);
        float area = InputUntil.inputFloat("Enter usage area:", scanner);
        float cost = InputUntil.inputFloat("Enter rental cost:", scanner);
        int maxPerson = InputUntil.inputInteger("Enter the maximum number of people to be hired:", scanner);
        String type = InputUntil.inputList("Choose rental type:", scanner, "Year,Moth,Day");
        String standard = InputUntil.inputString("Enter standard room:", scanner);
        float poolArea = InputUntil.inputInteger("Enter the pool area:", scanner);
        int floor = InputUntil.inputInteger("Enter the number of floors for rent:", scanner);
        villaList.put(new Villa("Villa-" + numberName, area, cost, maxPerson, type, standard, poolArea, floor), 0);
        FileWrite.writeToFileFacility(villaList,FILE_VILLA);
        System.out.println("Successfully created!");
    }

    public void addHouse() {
        String numberName = InputUntil.inputString("Enter number Name ID", scanner, ID);
        float area = InputUntil.inputFloat("Enter usage area:", scanner);
        float cost = InputUntil.inputFloat("Enter rental cost:", scanner);
        int maxPerson = InputUntil.inputInteger("Enter the maximum number of people to be hired:", scanner);
        String type = InputUntil.inputList("Choose rental type:", scanner, "Year,Moth,Day");
        String standard = InputUntil.inputString("Enter standard room:", scanner);
        int floor = InputUntil.inputInteger("Enter the number of floors for rent:", scanner);
        houseList.put(new House("House-" + numberName, area, cost, maxPerson, type, standard, floor), 0);
        FileWrite.writeToFileFacility(houseList,FILE_HOUSE);
        System.out.println("Successfully created!");
    }
    public void addRoom() {
        String numberName = InputUntil.inputString("Enter number Name ID", scanner, ID);
        float area = InputUntil.inputFloat("Enter usage area:", scanner);
        float cost = InputUntil.inputFloat("Enter rental cost:", scanner);
        int max = InputUntil.inputInteger("Enter the maximum number of people to be hired:", scanner);
        String type = InputUntil.inputList("Choose rental type:", scanner, "Year,Moth,Day");
        String freeService = InputUntil.inputString("Free service included:", scanner);
        roomList.put(new Room("Room-" + numberName, area, cost, max, type, freeService), 0);
        FileWrite.writeToFileFacility(roomList,FILE_ROOM);
        System.out.println("Successfully created!");
    }
    public static String checkIdFacility(){
            System.out.println("1. Display Villa \n" +
                    "2. Display House \n" +
                    "3. Display Room");
            System.out.println("Choose:");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    for (Facility inVilla: villaList.keySet()
                         ) {
                        System.out.println(inVilla + "number of times rented:"+villaList.get(inVilla));
                    }
                    String idVilla = InputUntil.inputString("Enter id you need:",scanner);
                    for (Facility in: villaList.keySet()
                    ) {
                        if(in.getServiceName().equals(idVilla)){
                            villaList.put(in,villaList.get(in)+1);
                            FileWrite.writeToFileFacility(villaList,FILE_VILLA);
                            return in.getServiceName();
                        }
                    }
                    break;
                case "2":
                    for (Facility inVilla: houseList.keySet()
                    ) {
                        System.out.println(inVilla + "number of times rented:"+houseList.get(inVilla));
                    }
                    String idHouse = InputUntil.inputString("Enter id you need:",scanner);
                    for (Facility in: houseList.keySet()
                    ) {
                        if(in.getServiceName().equals(idHouse)){
                            houseList.put(in,houseList.get(in)+1);
                            FileWrite.writeToFileFacility(houseList,FILE_HOUSE);
                            return in.getServiceName();
                        }
                    }
                    break;
                case "3":
                    for (Facility inVilla: roomList.keySet()
                    ) {
                        System.out.println(inVilla + "number of times rented:"+roomList.get(inVilla));
                    }
                    String idRoom = InputUntil.inputString("Enter id you need:",scanner);
                    for (Facility in: roomList.keySet()
                    ) {
                        if(in.getServiceName().equals(idRoom)){
                            roomList.put(in,roomList.get(in)+1);
                            FileWrite.writeToFileFacility(roomList,FILE_ROOM);
                            return in.getServiceName();
                        }
                    }
                    break;
            }

        return checkIdFacility();
    }
}
