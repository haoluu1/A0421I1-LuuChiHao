package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();

    static{
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://tse2.mm.bing.net/th?id=OIP.ouny3Jqc6yF-2YY9Ji37MgHaEo&pid=Api&P=0&w=306&h=191"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","https://tse4.mm.bing.net/th?id=OIP.dcW1T07m0W7D4-rkkAK1VgHaEo&pid=Api&P=0&w=306&h=191"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","https://tse2.mm.bing.net/th?id=OIP.kXh_mbOEZqJRj4Q09F67PAHaEo&pid=Api&P=0&w=306&h=191"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","https://tse3.mm.bing.net/th?id=OIP.otLfMQnLclxpf_74zaY7IQHaFj&pid=Api&P=0&w=254&h=191"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://tse3.mm.bing.net/th?id=OIP.td2pH35Vq_Gav7I2E8ZLSgHaFB&pid=Api&P=0&w=282&h=191"));
    }

    @Override
    public List<Customer> display() {
        return customerList;
    }
}
