package th.go.rd.atm;

public class Customer {
    //-------1. instance variable แบ่งได้ 2ประเภท
    //1.1 attributes
    private int id;
    private String name;
    private  String pin;
    //1.2 composition : "Has-A" relationship เป็นการสัมพันธ์ระหว่างคลาสแบบการมี
    private BankAccount account;

    public Customer(int id, String name, String pin) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id,name,"Saving");
    }

    public boolean checkPin(String pin){

        if (this.pin.equals(pin))
            return true;
        else
            return false;
//ให้ค่า return ออกมาเหมือนกันกับข้างบน แต่เป็นการเขียนแบบสั้น
//        return this.pin.equals(pin);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
