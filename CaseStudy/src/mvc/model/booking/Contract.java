package mvc.model.booking;

public class Contract implements Comparable<Contract> {
    private int idContract;
    private String idBooking;
    private double deposit;
    private double sumPay;
    private String idCustomer;
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s",idContract,idBooking,deposit,sumPay,idCustomer);
    }
    public Contract() {
    }

    public Contract(int idContract, String idBooking, double deposit, double sumPay, String idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.sumPay = sumPay;
        this.idCustomer = idCustomer;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getSumPay() {
        return sumPay;
    }

    public void setSumPay(double sumPay) {
        this.sumPay = sumPay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking='" + idBooking + '\'' +
                ", deposit=" + deposit +
                ", sumPay=" + sumPay +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contract o) {
        return o.idContract-o.idContract;
    }
}
