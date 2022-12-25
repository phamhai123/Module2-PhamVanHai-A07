package test.models;


public class SavingAccount extends BankAccount implements Comparable<SavingAccount> {
    protected double savingAmount;
    protected String startDate;
    protected String endDate;
    protected double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(int id, String accountCode, String accountHolder, String createDate, double savingAmount, String startDate, String endDate, double interestRate) {
        super(id, accountCode, accountHolder, createDate);
        this.savingAmount = savingAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestRate = interestRate;
    }

    public double getSavingAmount() {
        return savingAmount;
    }

    public void setSavingAmount(double savingAmount) {
        this.savingAmount = savingAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "id=" + id +
                ", accountCode='" + accountCode + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", createDate='" + createDate + '\'' +
                ", savingAmount=" + savingAmount +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }

    @Override
    public String writeInfoToCsv() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", id, accountCode, accountHolder, createDate, savingAmount, startDate, endDate, interestRate);
    }

    @Override
    public int compareTo(SavingAccount o) {
        return (int) (this.savingAmount - o.savingAmount);
    }
}
