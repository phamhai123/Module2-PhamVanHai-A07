package mvc.service;

import mvc.model.Facility;
import mvc.model.House;
import mvc.model.Room;
import mvc.model.Villa;
import mvc.utils.InputUntil;
import mvc.utils.ReadAndWriteFacility;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facility : facilityMap.entrySet()
        ) {
            System.out.printf("%s - %s\n", facility.getKey(), facility.getValue());
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
        float area = InputUntil.inputFloat("Enter usage area:", scanner);
        float cost = InputUntil.inputFloat("Enter rental cost:", scanner);
        int maxPerson = InputUntil.inputInteger("Enter the maximum number of people to be hired:", scanner);
        String type = InputUntil.inputString("Enter rental type:", scanner);
        String standard = InputUntil.inputString("Enter standard room:", scanner);
        int poolArea = InputUntil.inputInteger("Enter the pool area:", scanner);
        int floor = InputUntil.inputInteger("Enter the number of floors for rent:", scanner);
        facilityMap.put(new Villa("Villa", area, cost, maxPerson, type, standard, poolArea, floor), 0);
        ReadAndWriteFacility.writeToFile(facilityMap);
        System.out.println("Successfully created!");
    }

    public void addHouse() {
        float area = InputUntil.inputFloat("Enter usage area:", scanner);
        float cost = InputUntil.inputFloat("Enter rental cost:", scanner);
        int maxPerson = InputUntil.inputInteger("Enter the maximum number of people to be hired:", scanner);
        String type = InputUntil.inputString("Enter rental type:", scanner);
        String standard = InputUntil.inputString("Enter standard room:", scanner);
        int floor = InputUntil.inputInteger("Enter the number of floors for rent:", scanner);
        facilityMap.put(new House("House", area, cost, maxPerson, type, standard, floor), 0);
        ReadAndWriteFacility.writeToFile(facilityMap);
        System.out.println("Successfully created!");
    }

    public void addRoom() {
        float area = InputUntil.inputFloat("Enter usage area:", scanner);
        float cost = InputUntil.inputFloat("Enter rental cost:", scanner);
        int max = InputUntil.inputInteger("Enter the maximum number of people to be hired:", scanner);
        String type = InputUntil.inputString("Enter rental type:", scanner);
        String freeService = InputUntil.inputString("Free service included:", scanner);
        facilityMap.put(new Room("Room", area, cost, max, type, freeService), 0);
        ReadAndWriteFacility.writeToFile(facilityMap);
        System.out.println("Successfully created!");
    }
}
