package test.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private double soTienGui;
    private String ngayGui;
    private double laiXuat;
    private String kiHan;

    public TaiKhoanTietKiem() {

    }

    @Override
    public String Info() {
        return String.format("%s,%s,%s,%s,%s,%s", getId(), getMaTaiKhoan(), getTenTaiKhoan(),getNgayTao(), getSoTienGui(), getNgayGui(), getLaiXuat(), getKiHan());
    }

    public TaiKhoanTietKiem(double soTienGui, String ngayGui, double laiXuat, String kiHan) {
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int id, double maTaiKhoan, String tenTaiKhoan, String ngayTao, double soTienGui, String ngayGui, double laiXuat, String kiHan) {
        super(id, maTaiKhoan, tenTaiKhoan, ngayTao);
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                "id=" + super.getId() +
                ", maTaiKhoan=" + super.getMaTaiKhoan() +
                ", tenTaiKhoan='" + super.getTenTaiKhoan() + '\'' +
                ", ngayTao='" + super.getNgayTao() + '\'' +
                ", soTienGui=" + soTienGui +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiXuat=" + laiXuat +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
