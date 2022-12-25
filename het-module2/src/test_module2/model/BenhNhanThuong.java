package test_module2.model;

public class BenhNhanThuong extends BenhAn{
    protected double phiVien;

    public BenhNhanThuong(int i, String attributeValue, String value, String s, String attributeValue1, String value1, String s1, String attributeValue2, double v) {
    }

    public BenhNhanThuong(int tt, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhap, String ngayXuat, String liDoNhap, double phiVien) {
        super(tt, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhap, ngayXuat, liDoNhap);
        this.phiVien = phiVien;
    }

    public double getPhiVien() {
        return phiVien;
    }

    public void setPhiVien(double phiVien) {
        this.phiVien = phiVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" +
                "tt=" + tt +
                ", maBenhAn=" + maBenhAn +
                ", maBenhNhan=" + maBenhNhan +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", ngayXuat='" + ngayXuat + '\'' +
                ", liDoNhap='" + liDoNhap + '\'' +
                ", phiVien=" + phiVien +
                "} " + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",tt,maBenhAn,maBenhNhan,tenBenhNhan,ngayNhap,ngayXuat,liDoNhap,phiVien);
    }
}
