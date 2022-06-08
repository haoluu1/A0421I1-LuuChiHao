package com.example.demo.repository.service;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    @Query(value= "select * from service where name like concat('%', :name, '%')",
            countQuery = "select count(*) from service where name like concat('%', :name , '%')",
            nativeQuery = true)
    Page<Service> findAll(@Param("name") String name, Pageable pageable);
}
