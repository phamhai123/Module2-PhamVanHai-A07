package test.models;


public class PaymentAccount extends BankAccount {
    protected String cardNumber;
    protected double paymentAmount;

    public PaymentAccount() {
    }

    public PaymentAccount(int id, String accountCode, String accountHolder, String createDate, String cardNumber, double paymentAmount) {
        super(id, accountCode, accountHolder, createDate);
        this.cardNumber = cardNumber;
        this.paymentAmount = paymentAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return paymentAmount;
    }

    public void setAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "id=" + id +
                ", accountCode='" + accountCode + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", createDate='" + createDate + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", paymentAmount=" + paymentAmount +
                '}';
    }

    @Override
    public String writeInfoToCsv() {
        return String.format("%s,%s,%s,%s,%s,%s\n", id, accountCode, accountHolder, createDate, cardNumber, paymentAmount);
    }
}
