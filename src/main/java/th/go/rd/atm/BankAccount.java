package th.go.rd.atm;

public class BankAccount {
    private int id;
    private String name;
    private String type;
    private double balance;


    public BankAccount(int id, String name, String type){
        this.id =id;
        this.name = name;
        this.type = type;
        this.balance = 0;
    }

    public BankAccount(int id, String name, String type, double balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public void deposit(double amount){
        //balance = balance + amount;
        balance += amount;
    }

    public void withdraw(double amount){
        //balance = balance - amount;
        balance -= amount;
    }

    //--------------getter----------------
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
