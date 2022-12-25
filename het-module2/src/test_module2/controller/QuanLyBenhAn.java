package test_module2.controller;

import test_module2.service.BenhAnServiceImpl;

import java.util.Scanner;

public class QuanLyBenhAn {
    public static void main(String[] args) {
        BenhAnServiceImpl menulog = new BenhAnServiceImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chọn chức năng theo số \n" +
                    "1. Thêm mới \n" +
                    "2. Xóa \n" +
                    "3. Xem danh sách bệnh án \n" +
                    "4.Thoát \n" );
            System.out.println("Chọ chức năng:");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    System.out.println("==THÊM MỚI==");
                    menulog.create();
                    break;
                case "2":
                    System.out.println("==xÓA==");
                    menulog.delete();
                    break;
                case "3":
                    System.out.println("==XEM DANH SÁCH CÁC BỆNH ÁN==");
                    menulog.display();
                    break;
                case "4":
                    System.out.println("==THOÁT==");
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
