package mvc.model;

import java.io.Serializable;
import java.util.Date;

public class Customer extends Person implements Serializable {
    private String typeGuest;
    private String address;

    public Customer(String typeGuest, String address) {
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public Customer(int id, String name, String birthDate, String sex, double identityCard, double phoneNumber, String email, String typeGuest, String address) {
        super(id, name, birthDate, sex, identityCard, phoneNumber, email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", getId(), getName(), getBirthDate(), getSex(), getIdentityCard(), getPhoneNumber(), getEmail(), getTypeGuest(), getAddress());
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                ", sex='" + super.getSex() + '\'' +
                ", identityCard=" + super.getIdentityCard() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                ", typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
