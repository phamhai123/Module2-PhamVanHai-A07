package mvc.utils;

import mvc.model.Facility;
import mvc.model.House;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ReadAndWriteFacility {
    private static final String FILE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\house.csv";
    public static void writeToFile(Map<House, Integer> houseMap) {
        try {
            FileWriter fw = new FileWriter(FILE_PATH);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Map.Entry<House, Integer> houseEntry: houseMap.entrySet()
            ) {
                bw.write(houseEntry.getValue()+houseEntry.getKey().getInfo());
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
