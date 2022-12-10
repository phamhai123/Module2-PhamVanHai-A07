package thi_module_2.model;

public class AccountPayment extends AccountBank{
    private double cardNumber;
    private double coinNumber;
    public AccountPayment() {

    }

    public AccountPayment(double cardNumber, double coinNumber) {
        this.cardNumber = cardNumber;
        this.coinNumber = coinNumber;
    }

    public AccountPayment(int id, double accountCode, String accountName, String dayCreate, double cardNumber, double coinNumber) {
        super(id, accountCode, accountName, dayCreate);
        this.cardNumber = cardNumber;
        this.coinNumber = coinNumber;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(double cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCoinNumber() {
        return coinNumber;
    }

    public void setCoinNumber(double coinNumber) {
        this.coinNumber = coinNumber;
    }

    @Override
    public String Info() {
        return String.format("%s,%s,%s,%s,%s,%s \n", getId(),getAccountCode(),getAccountName(),getDayCreate(),getCardNumber(),getCoinNumber());
    }

    @Override
    public String toString() {
        return "AccountPayment{" +
                " id=" + super.getId() +
                ", accountCode=" + super.getAccountCode() +
                ", accountName='" + super.getAccountName() + '\'' +
                ", dayCreate='" + super.getDayCreate() + '\'' +
                ", cardNumber=" + cardNumber +
                ", coinNumber=" + coinNumber +
                '}';
    }
}
