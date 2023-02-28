package thi_module_2.model;

public class AccountSaving extends AccountBank {
    private double coinSave;
    private String firstSave;
    private double interestRate;
    private String dateSave;


    @Override
    public String Info() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", getId(),getAccountCode(), getAccountName(), getDayCreate(), getCoinSave(), getDaySave(), getInterestRate(), getDateSave());
    }
    public AccountSaving() {

    }
    public AccountSaving(double coinSave, String daySave, double interestRate, String dateSave) {
        this.coinSave = coinSave;
        this.firstSave = daySave;
        this.interestRate = interestRate;
        this.dateSave = dateSave;
    }

    public AccountSaving(int id, double accountCode, String accountName, String dayCreate, double coinSave, String daySave, double interestRate, String dateSave) {
        super(id, accountCode, accountName, dayCreate);
        this.coinSave = coinSave;
        this.firstSave = daySave;
        this.interestRate = interestRate;
        this.dateSave = dateSave;
    }

    public double getCoinSave() {
        return coinSave;
    }

    public void setCoinSave(double coinSave) {
        this.coinSave = coinSave;
    }

    public String getDaySave() {
        return firstSave;
    }

    public void setDaySave(String daySave) {
        this.firstSave = daySave;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getDateSave() {
        return dateSave;
    }

    public void setDateSave(String dateSave) {
        this.dateSave = dateSave;
    }

    @Override
    public String toString() {
        return "AccountSaving{" +
                " id=" + super.getId() +
                ", accountCode=" + super.getAccountCode() +
                ", accountName='" + super.getAccountName() + '\'' +
                ", dayCreate='" + super.getDayCreate() + '\'' +
                ", coinSave=" + coinSave +
                ", daySave='" + firstSave + '\'' +
                ", interestRate=" + interestRate +
                ", dateSave='" + dateSave + '\'' +
                '}';
    }
}
