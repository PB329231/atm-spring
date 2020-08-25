package th.go.rd.atm;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class WebServiceDataSource implements Datasource{
    public ArrayList<Customer> getCustomerData(){
        //จำลองการต่อ web service API เพื่อดุึงข้อมูลลูกค้า
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"แอนดี้","1234"));
        customers.add(new Customer(200,"ไบรอัน","2345"));
        return customers;
    }
}
