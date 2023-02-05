package mvc.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {

    }


    public Employee(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }


    public Employee(int id, String name, String birthDate, String sex, double identityCard, double phoneNumber, String email, String level, String position, double salary) {
        super(id, name, birthDate, sex, identityCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n", getId(), getName(), getBirthDate(), getSex(), getIdentityCard(), getPhoneNumber(), getEmail(), getLevel(), getPosition(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                ", sex='" + super.getSex() + '\'' +
                ", identityCard=" + super.getIdentityCard() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
