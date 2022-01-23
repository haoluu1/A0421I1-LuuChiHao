package service.Customer;

import model.Customer;
import repository.Customer.CustomerRepository;
import repository.Customer.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> view() {
        return customerRepository.view();
    }

    @Override
    public boolean create(Customer customer) {
        Customer customer1 = findById(customer.getId()+"");
        if(customer1!=null) {
            return false;
        } else {
            customerRepository.create(customer);
            return true;
        }
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> searchById(String id) {
        return customerRepository.searchById(id);
    }

    @Override
    public void save(String id, String type_id, String name, String birthday, String gender, String id_card, String phone, String email, String address) {
        customerRepository.save(id, type_id, name, birthday, gender, id_card, phone, email, address);
    }

    @Override
    public void delete(String id) {
        customerRepository.delete(id);
    }
}
