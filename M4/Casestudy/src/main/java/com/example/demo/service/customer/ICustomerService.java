package com.example.demo.service.customer;

import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> getAllCustomer(String name,
                                  Pageable pageable);

    void save(Customer customer);

    Customer findById(int id);

    void delete(int id);
}
