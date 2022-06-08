package com.example.demo.repository.customer;

import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value= "select * from customer where name like concat('%', :name, '%')",
            countQuery = "select count(*) from employee where name like concat('%', :name , '%')",
            nativeQuery = true)
    Page<Customer> findAll(@Param("name") String name, Pageable pageable);
}
