package com.example.demo.service.customer;

import com.example.demo.model.customer.Customer;
import com.example.demo.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> getAllCustomer(String name,
                                         Pageable pageable) {
        return customerRepository.findAll(name, pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null){
            customerRepository.delete(customer);
        }
    }
}
