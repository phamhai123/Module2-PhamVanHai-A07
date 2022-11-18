package mvc.model;

public abstract class Person {
    private int id;
    private String name;
    private int birthDate;
    private String sex;
    private int identityCard;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, int birthDate, String sex, int identityCard, int phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
