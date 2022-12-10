package test.util;

import test.model.TaiKhoanThanhToan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static final String FILE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\thi_module2\\src\\data\\quanlytaikhoan.csv";
    public static void writeFile(List<TaiKhoanThanhToan> list) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoanThanhToan index: list
                 ) {
                bufferedWriter.write(index.Info());
                bufferedWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<TaiKhoanThanhToan> readFile() {
        List<TaiKhoanThanhToan> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp[];
            String trim = "";
            while ((trim = bufferedReader.readLine()) != null) {
                temp = trim.split(",");
                int id = Integer.parseInt(temp[0]);
                double maTaiKhoan = Double.parseDouble(temp[1]);
                String ten = temp[2];
                String ngayTao = temp[3];
                int soThe = Integer.parseInt(temp[4]);
                double soTien = Double.parseDouble(temp[5]);
                list.add(new TaiKhoanThanhToan(id,maTaiKhoan,ten,ngayTao,soThe,soTien));
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}
