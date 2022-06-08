package com.example.demo.service.service;

import com.example.demo.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServiceService {
    Page<Service> getAllService(String name,
                                Pageable pageable);

    void save(Service service);
}
