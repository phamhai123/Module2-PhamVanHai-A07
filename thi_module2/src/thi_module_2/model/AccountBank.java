package thi_module_2.model;

import java.util.Objects;

public abstract class AccountBank {
    private int id;
    private double accountCode;
    private String accountName;
    private String dayCreate;
    public AccountBank() {

    }
    public AccountBank(int id, double accountCode, String accountName, String dayCreate) {
        this.id = id;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.dayCreate = dayCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(double accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDayCreate() {
        return dayCreate;
    }

    public void setDayCreate(String dayCreate) {
        this.dayCreate = dayCreate;
    }
    public abstract String Info();

    @Override
    public String toString() {
        return "AccountBank{" +
                "id=" + id +
                ", accountCode=" + accountCode +
                ", accountName='" + accountName + '\'' +
                ", dayCreate='" + dayCreate + '\'' +
                '}';
    }

}
