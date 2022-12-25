package thi_modue2;

public abstract class ChuNhat {

  protected int rong;
  protected int dai;

    public ChuNhat() {
    }

    public ChuNhat(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    @Override
    public String toString() {
        return "ChuNhat{" +
                "rong=" + rong +
                ", dai=" + dai +
                '}';
    }
}
