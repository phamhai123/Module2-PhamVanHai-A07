package test.services;

import test.model.TaiKhoanThanhToan;
import test.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanImp implements TaiKhoanThanhToanEmpl {
    private static List<TaiKhoanThanhToan> list = ReadAndWriteFile.readFile();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        System.out.println("Nhập id :");
        int id = scanner.nextInt();
        System.out.println("Nhập mã tài khoản");
        double maTaiKhoan = scanner.nextDouble();
        System.out.println("Nhập tên tài khoản");
        String tenTaiKhoan = scanner.next();
        String ngayTao = scanner.next();
        int soThe = scanner.nextInt();
        double soTien = scanner.nextDouble();
        list.add(new TaiKhoanThanhToan(id,maTaiKhoan,tenTaiKhoan, ngayTao,soThe,soTien));
        ReadAndWriteFile.writeFile(list);
    }

    @Override
    public void xem() {
        for (TaiKhoanThanhToan taiKhoan: list
             ) {
            System.out.println(taiKhoan);
        }
    }

    @Override
    public void xoa() {
        System.out.println("Nhập id cần xóa :");
        int index = scanner.nextInt();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getId() == index) {
                System.out.println("Nhập id :");
                int id = scanner.nextInt();
                System.out.println("Nhập mã tài khoản");
                double maTaiKhoan = scanner.nextDouble();
                System.out.println("Nhập tên tài khoản");
                String tenTaiKhoan = scanner.next();
                String ngayTao = scanner.next();
                int soThe = scanner.nextInt();
                double soTien = scanner.nextDouble();
                list.set(i, new TaiKhoanThanhToan(id, maTaiKhoan, tenTaiKhoan, ngayTao, soThe, soTien));
                ReadAndWriteFile.writeFile(list);
            }
        }
    }

    @Override
    public void timKiem() {

    }
}
