package com.example.demo.repository.customer;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
