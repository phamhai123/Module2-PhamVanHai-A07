package test_module2.model;

public class BenhNhanVIP extends BenhAn{
    protected String goiVip;
    protected String thoiHanVIp;

    public BenhNhanVIP() {
    }

    public BenhNhanVIP(int tt, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhap, String ngayXuat, String liDoNhap, String goiVip, String thoiHanVIp) {
        super(tt, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhap, ngayXuat, liDoNhap);
        this.goiVip = goiVip;
        this.thoiHanVIp = thoiHanVIp;
    }

    public String getGoiVip() {
        return goiVip;
    }

    public void setGoiVip(String goiVip) {
        this.goiVip = goiVip;
    }

    public String getThoiHanVIp() {
        return thoiHanVIp;
    }

    public void setThoiHanVIp(String thoiHanVIp) {
        this.thoiHanVIp = thoiHanVIp;
    }

    @Override
    public String toString() {
        return "BenhNhanVIP{" +
                "tt=" + tt +
                ", maBenhAn=" + maBenhAn +
                ", maBenhNhan=" + maBenhNhan +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", ngayXuat='" + ngayXuat + '\'' +
                ", liDoNhap='" + liDoNhap + '\'' +
                ", goiVip='" + goiVip + '\'' +
                ", thoiHanVIp='" + thoiHanVIp + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",tt,maBenhAn,maBenhNhan,tenBenhNhan,ngayNhap,ngayXuat,liDoNhap,goiVip,thoiHanVIp);
    }
}
