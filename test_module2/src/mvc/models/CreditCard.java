package mvc.models;

public class CreditCard extends BankCard{
    private double debt;
    private double creditLimit;

    public CreditCard() {
    }


    public CreditCard(double debt, double creditLimit) {
        this.debt = debt;
        this.creditLimit = creditLimit;
    }

    public CreditCard(String numberCard, String nameCard, String CCCD, String address, double debt, double creditLimit) {
        super(numberCard, nameCard, CCCD, address);
        this.debt = debt;
        this.creditLimit = creditLimit;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",numberCard,nameCard,CCCD,address,debt,creditLimit);
    }
    @Override
    public String toString() {
        return "CreditCard{" +
                "numberCard='" + numberCard + '\'' +
                ", nameCard='" + nameCard + '\'' +
                ", CCCD='" + CCCD + '\'' +
                ", address='" + address + '\'' +
                ", debt=" + debt +
                ", creditLimit=" + creditLimit +
                "} " + super.toString();
    }
}
