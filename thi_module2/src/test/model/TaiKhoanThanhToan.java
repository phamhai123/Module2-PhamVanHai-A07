package test.model;


public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private int soThe;
    private double soTien;

    public TaiKhoanThanhToan() {

    }

    @Override
    public String Info() {
        return String.format("%s,%s,%s,%s,%s,%s \n", getId(), getMaTaiKhoan(), getNgayTao() ,getTenTaiKhoan(), getSoThe(), getSoTien());
    }

    public TaiKhoanThanhToan(int soThe, Double soTien) {
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public TaiKhoanThanhToan(int id, double maTaiKhoan, String tenTaiKhoan, String ngayTao, int soThe, Double soTien) {
        super(id, maTaiKhoan, tenTaiKhoan, ngayTao);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public Double getSoTien() {
        return soTien;
    }

    public void setSoTien(Double soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                "id=" + super.getId() +
                ", maTaiKhoan=" + super.getMaTaiKhoan() +
                ", tenTaiKhoan='" + super.getTenTaiKhoan() + '\'' +
                ", ngayTao='" + super.getNgayTao() + '\'' +
                ", soThe=" + soThe +
                ", soTien=" + soTien +
                '}';
    }
}
