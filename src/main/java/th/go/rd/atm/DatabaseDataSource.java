package th.go.rd.atm;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

//@Component
public class DatabaseDataSource implements Datasource {
    public ArrayList<Customer> getCustomerData(){
        //database จำลอง
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"Andy","1234"));
        customers.add(new Customer(200,"Brian","2345"));
        return customers;
    }
}
