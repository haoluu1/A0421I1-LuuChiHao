package com.example.demo.service.service;

import com.example.demo.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IServiceService {
    Page<Service> getAllService(String name,
                                Pageable pageable);

    void save(Service service);

    List<Service> findAll();
}
