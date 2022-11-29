import java.sql.SQLOutput;

public class employee {
    int id;
    String name;
    address address;

    public employee(int id, String name, address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display() {
        System.out.println(id + name);
        System.out.println(address.city + address.state + address.country);
    }

}
