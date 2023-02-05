package unnecessary;

import mvc.model.facility.Facility;
import mvc.model.facility.House;
import mvc.model.facility.Room;
import mvc.model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFacility {

    public static void writeToFile(LinkedHashMap<Facility, Integer> facilityList, String linkFile) {
        try {
            FileWriter fw = new FileWriter(linkFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()
            ) {
                bw.write(entry.getKey().getInfo() + "," + entry.getValue());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static LinkedHashMap<Facility, Integer> readFromFile(String linkFile) {
        LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
        try {
            FileReader file = new FileReader(linkFile);
            BufferedReader buffered = new BufferedReader(file);
            String line = "";
            String temp[];
            String checkName[];
            if ((line = buffered.readLine()) != null) {
                temp = line.split(",");
                checkName = temp[0].split("-");
                if (checkName[0].equals("Villa")) {
                    String numberName = temp[0];
                    float area = Float.parseFloat(temp[1]);
                    float cost = Float.parseFloat(temp[2]);
                    int maxPerson = Integer.parseInt(temp[3]);
                    String type = temp[4];
                    String standard = temp[5];
                    int poolArea = Integer.parseInt(temp[6]);
                    int floor = Integer.parseInt(temp[7]);
                    int numberRented = Integer.parseInt(temp[8]);
                    facilityList.put(new Villa(numberName,area,cost,maxPerson,type,standard,poolArea,floor),numberRented);
                } else if (checkName[0].equals("House")) {
                    String numberName = temp[0];
                    float area = Float.parseFloat(temp[1]);
                    float cost = Float.parseFloat(temp[2]);
                    int maxPerson = Integer.parseInt(temp[3]);
                    String type = temp[4];
                    String standard = temp[5];
                    int floor = Integer.parseInt(temp[6]);
                    int numberRented = Integer.parseInt(temp[7]);
                    facilityList.put(new House(numberName,area,cost,maxPerson,type,standard,floor),numberRented);
                } else if (checkName[0].equals("Room")) {
                    String numberName = temp[0];
                    float area = Float.parseFloat(temp[1]);
                    float cost = Float.parseFloat(temp[2]);
                    int maxPerson = Integer.parseInt(temp[3]);
                    String type = temp[4];
                    String freeService = temp[5];
                    int numberRented = Integer.parseInt(temp[6]);
                    facilityList.put(new Room(numberName,area,cost,maxPerson,type,freeService),numberRented);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return facilityList;
    }
}
