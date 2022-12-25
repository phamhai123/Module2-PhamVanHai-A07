package test_module2.service;

import test.models.BankAccount;
import test_module2.model.BenhAn;
import test_module2.model.BenhNhanThuong;
import test_module2.model.BenhNhanVIP;
import test_module2.utils.FileReaderAndWriter;
import test_module2.utils.InputUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnServiceImpl implements BenhAnSerivce{

    private static final String DATABASE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\het-module2\\src\\test_module2\\data\\quanly.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<BenhAn> list = FileReaderAndWriter.readFile(DATABASE_PATH);
    @Override
    public void create() {
        MENU :do {
            System.out.println("1. Bệnh nhân thường \n"+
                    "2. Bệnh nhân VIP \n"+
                    "3. Thoát ra menu ");
            System.out.println("Chọn chức năng:");
            String chon = scanner.nextLine();
            switch (chon){
                case "1":
                    System.out.println("==BỆNH NHÂN THƯỜNG==");
                    themThuong();
                    break;
                case "2":
                    System.out.println("==BỆNH NHÂN VIP==");
                    themVIP();
                    break;
                case "3":
                    break MENU;
            }
        }while (true);
    }

    @Override
    public void delete() {
        int count = 0;
        display();
        int xoa = test.utils.InputUtil.inputInt("Nhập số thứ tự cần xóa", scanner);
        for (BenhAn lists: list){
            if (lists.getTt() == xoa ) {
                list.remove(lists);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không thể xóa, TT=" + xoa );
        } else {
            FileReaderAndWriter.writeFile(list,DATABASE_PATH);
        }
    }

    @Override
    public void display() {
        for (BenhAn lists: list
             ) {
            System.out.println(lists);
        }
    }
    public static void themThuong(){
        int tt = 0;
        String maBennhAn = InputUtil.inputString("Nhập mã bệnh án",scanner);
        String maBenhNhan = InputUtil.inputString("Nhập mã bệnh nhân",scanner);
        String tenBenNhan = InputUtil.inputString("Nhập tên bệnh nhân",scanner);
        String ngayNhap = InputUtil.inputString("Nhập ngày nhập viện",scanner);
        String ngayXuat = InputUtil.inputString("Nhập ngày xuất viện",scanner);
        String liDO = InputUtil.inputString("Nhập lí do vào viện",scanner);
        double phi = InputUtil.inputDouble("Nhập phí nhập viện", scanner);
        list.add(new BenhNhanThuong(tt,maBennhAn,maBenhNhan,tenBenNhan,ngayNhap,ngayXuat,liDO,phi));
        FileReaderAndWriter.writeFile(list,DATABASE_PATH);
    }
    public static void themVIP(){
        int tt = 0;
        String maBennhAn = InputUtil.inputString("Nhập mã bệnh án",scanner);
        String maBenhNhan = InputUtil.inputString("Nhập mã bệnh nhân",scanner);
        String tenBenNhan = InputUtil.inputString("Nhập tên bệnh nhân",scanner);
        String ngayNhap = InputUtil.inputString("Nhập ngày nhập viện",scanner);
        String ngayXuat = InputUtil.inputString("Nhập ngày xuất viện",scanner);
        String liDO = InputUtil.inputString("Nhập lí do vào viện",scanner);
        String goiVip = InputUtil.inputString("Nhập Gói vip",scanner);
        String thoiHan = InputUtil.inputString("Nhập Thời hạn vip",scanner);
        list.add(new BenhNhanVIP(tt,maBennhAn,maBenhNhan,tenBenNhan,ngayNhap,ngayXuat,liDO,goiVip,thoiHan));
    }
}
