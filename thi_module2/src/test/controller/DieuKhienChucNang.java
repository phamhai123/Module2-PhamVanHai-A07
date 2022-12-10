package test.controller;

import test.services.TaiKhoanThanhToanImp;

import java.util.Scanner;

public class DieuKhienChucNang {
    public static void main(String[] args) {
        quanLy();
    }
    static Scanner scanner = new Scanner(System.in);
    public static void quanLy() {
        String chon;
        while (true) {
            switch (chon = scanner.nextLine()) {
                case "1":
                    System.out.println("Quản lý tài khoản thanh toán");
                    taiKhoanThanhToan();
                    break;
                case "2":
                    System.out.println("Quản lý tài khoản tiến kiệm");
                    taiKhoanTietKiem();
                    break;
                default:
                    System.out.println("Nhập sai xin nhập lại");
            }
        }
    }
    public static void taiKhoanThanhToan() {
        TaiKhoanThanhToanImp taiKhoan = new TaiKhoanThanhToanImp();
        System.out.println("1.Thêm\n"+
                "2. Sửa xem ");
        String chon = scanner.nextLine();
        switch (chon) {
            case "1":
                taiKhoan.them();
                break;
            case "2":
                taiKhoan.xem();
                break;
            case "3":
                taiKhoan.xoa();
                break;
            case "4":
                taiKhoan.timKiem();
                break;
        }
    }
    public static void taiKhoanTietKiem() {

    }

}
