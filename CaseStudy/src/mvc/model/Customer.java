package mvc.model;

public class Customer extends Person{
    private String typeGuest;
    private String address;

    public Customer() {
    }

    public Customer(String typeGuest, String address) {
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public Customer(int id, String name, int birthDate, String sex, int identityCard, int phoneNumber, String email, String typeGuest, String address) {
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
    public String toString() {
        return "Customer{" +"id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                ", sex='" + super.getSex() + '\'' +
                ", identityCard=" + super.getIdentityCard() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                "typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
   }
}
