package test_module2.utils;

import test_module2.model.BenhAn;
import test_module2.model.BenhNhanThuong;
import test_module2.model.BenhNhanVIP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderAndWriter {
    public static void writeFile(List<BenhAn> content, String filePath) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        // Check file exist
        for (int i = 0; i < content.size(); i++) {
            content.get(i).setTt(i + 1);
            // Write file
            try {

                fw = new FileWriter(filePath);
                bw = new BufferedWriter(fw);
                for (BenhAn line : content) {
                    bw.write(line.getInfo());
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

    }

    public static List<BenhAn> readFile(String file) {
        List<BenhAn> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            String temp[];
            String line;
            while ((line = buffered.readLine())!=null){
                temp = line.split(",");
                int tt = Integer.parseInt(temp[0]);
                String benhAn = temp[2];
                String maBn = temp[3];
                String tenBn = temp[4];
                String ngayN = temp[5];
                String ngayX = temp[6];
                String liDo = temp[7];
                if(temp.length == 9){
                    double phi = Double.parseDouble(temp[8]);
                    list.add(new BenhNhanThuong(tt,benhAn,maBn,tenBn,ngayN,ngayX,liDo,phi));
                }else if(temp.length == 10) {
                    String loaiVip = temp[8];
                    String ngayVip = temp[9];
                    list.add(new BenhNhanVIP(tt,benhAn,maBn,tenBn,ngayN,ngayX,liDo,loaiVip,ngayVip));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
