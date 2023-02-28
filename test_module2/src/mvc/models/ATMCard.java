package mvc.models;

public class ATMCard extends BankCard {
    private double balance;

    public ATMCard() {
    }

    public ATMCard(double balance) {
        this.balance = balance;
    }

    public ATMCard(String numberCard, String nameCard, String CCCD, String address, double balance) {
        super(numberCard, nameCard, CCCD, address);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s",numberCard,nameCard,CCCD,address,balance);
    }

    @Override
    public String toString() {
        return "ATMCard{" +
                "numberCard='" + numberCard + '\'' +
                ", nameCard='" + nameCard + '\'' +
                ", CCCD='" + CCCD + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                "} " + super.toString();
    }
}
