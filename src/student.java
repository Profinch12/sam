import java.sql.SQLOutput;

public class student {
    public double id;
    public String name;
    public String address;
    public double contact;

    public student(double id, String name, String address, double contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                '}';
    }

    public void displaystudent()
    {
        System.out.println(id + name + address + contact);
    }
}
