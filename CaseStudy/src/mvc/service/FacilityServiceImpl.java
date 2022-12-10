package mvc.service;

import mvc.model.Facility;
import mvc.model.House;
import mvc.model.Room;
import mvc.model.Villa;
import mvc.utils.ReadAndWriteFacility;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facility: facilityMap.entrySet()
             ) {
            System.out.printf("%s - %s\n", facility.getKey(), facility.getValue());
        }
    }
//
//    @Override
//    public void create() {
//
//    }
//
//    @Override
//    public void edit() {
//
//    }
//
//    @Override
//    public void delete() {

//    }

    @Override
    public void addVilla() {
        System.out.println("Nhập Diện tích sử dụng :");
        float area = scanner.nextFloat();
        System.out.println("Nhập Chi phí thuê :");
        float cost = scanner.nextFloat();
        System.out.println("Nhập số lượng người tối đa được thuê :");
        int max = scanner.nextInt();
        System.out.println("Nhâp kiểu thuê :");
        String type = scanner.next();
        System.out.println("Nhập tiêu chuẩn phòng :");
        String standard = scanner.next();
        System.out.println("Nhập diện tích hồ bơi :");
        int poolArea = scanner.nextInt();
        System.out.println("Nhâp số tầng cho thuê :");
        int floor = scanner.nextInt();
        facilityMap.put(new Villa("Villa",area,cost,max,type,standard,poolArea,floor),0);
    }

    @Override
    public void addHouse() {
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        System.out.println("Nhập Diện tích sử dụng :");
        float area = scanner.nextFloat();
        System.out.println("Nhập Chi phí thuê :");
        float cost = scanner.nextFloat();
        System.out.println("Nhập số lượng người tối đa được thuê :");
        int max = scanner.nextInt();
        System.out.println("Nhâp kiểu thuê :");
        String type = scanner.next();
        System.out.println("Nhập tiêu chuẩn phòng :");
        String standard = scanner.next();
        System.out.println("Nhâp số tầng cho thuê :");
        int floor = scanner.nextInt();
        houseMap.put(new House("House",area,cost,max,type,standard,floor),0);
        ReadAndWriteFacility.writeToFile(houseMap);
    }

    @Override
    public void addRoom() {
        System.out.println("Nhập Diện tích sử dụng :");
        float area = scanner.nextFloat();
        System.out.println("Nhập Chi phí thuê :");
        float cost = scanner.nextFloat();
        System.out.println("Nhập số lượng người tối đa được thuê :");
        int max = scanner.nextInt();
        System.out.println("Nhâp kiểu thuê :");
        String type = scanner.next();
        System.out.println("Dịch vụ miễn phí đi kèm :");
        String freeService = scanner.next();

        facilityMap.put(new Room("Room",area,cost,max,type,freeService),0);
    }
}
