package test_module2.model;

public abstract class BenhAn {
    protected int tt;
    protected String maBenhAn;
    protected String maBenhNhan;
    protected String tenBenhNhan;
    protected String ngayNhap;
    protected String ngayXuat;
    protected String liDoNhap;

    public BenhAn() {
    }


    public BenhAn(int tt, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhap, String ngayXuat, String liDoNhap) {
        this.tt = tt;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
        this.liDoNhap = liDoNhap;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getLiDoNhap() {
        return liDoNhap;
    }

    public void setLiDoNhap(String liDoNhap) {
        this.liDoNhap = liDoNhap;
    }
    public abstract String getInfo();

}
