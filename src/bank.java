public class bank {
    private int accid;
    private String name;
    private float amount;
    private double contact;

    public bank(int accid, String name, float amount, double contact) {
        this.accid = accid;
        this.name = name;
        this.amount = amount;
        this.contact = contact;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "bank{" +
                "accid=" + accid +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", contact=" + contact +
                '}';
    }
    public void displaybank()
    {
        System.out.println(accid+name+amount+contact);
    }
}
