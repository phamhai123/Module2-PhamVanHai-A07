package thi_modue2;

public class MyClass extends ChuNhat {
    protected String ten;
    protected int cao;

    public MyClass() {

    }

    public MyClass(int rong, int dai, String ten, int cao) {
        super(rong, dai);
        this.ten = ten;
        this.cao = cao;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "ten='" + ten + '\'' +
                ", cao=" + cao +
                ", rong=" + rong +
                ", dai=" + dai +
                "} " + super.toString();
    }
}
