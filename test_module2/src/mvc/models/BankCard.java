package mvc.models;

public abstract class BankCard {
    protected String numberCard;
    protected String nameCard;
    protected String CCCD;
    protected String address;

    public BankCard() {
    }

    public BankCard(String numberCard, String nameCard, String CCCD, String address) {
        this.numberCard = numberCard;
        this.nameCard = nameCard;
        this.CCCD = CCCD;
        this.address = address;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract String getInfo();
    @Override
    public String toString() {
        return "BankCard{" +
                "numberCard='" + numberCard + '\'' +
                ", nameCard='" + nameCard + '\'' +
                ", CCCD='" + CCCD + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
