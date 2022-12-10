package test.model;

public abstract class TaiKhoanNganHang {
    private int id;
    private double maTaiKhoan;


    private String tenTaiKhoan;
    private String ngayTao;
    public TaiKhoanNganHang() {

    }

    public TaiKhoanNganHang(int id, double maTaiKhoan, String tenTaiKhoan, String ngayTao) {
        this.id = id;
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.ngayTao = ngayTao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(double maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public abstract String Info();

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "id=" + id +
                ", maTaiKhoan=" + maTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                '}';
    }
}
