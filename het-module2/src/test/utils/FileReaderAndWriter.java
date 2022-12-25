package test.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderAndWriter {
    public static void writeFile(List<String> content, String filePath) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        // Check file exist

        // Write file
        try {
            fw = new FileWriter(filePath);
            bw = new BufferedWriter(fw);
            for (String line : content) {
                bw.write(line);
            }
        } catch (IOException e) {
            System.out.println("FileReaderAndWriter: Write file error");
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                System.out.println("FileReaderAndWriter : Undefined error occurs");
            }
        }

    }
    public static List<String> readFile(String filePath) {
        List<String> content = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader buffered = new BufferedReader(reader);
            String line = null;
            while ((line = buffered.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException e) {
            System.out.println("FileReaderAndWriter : Read file error");
        }
        return content;
    }
}
