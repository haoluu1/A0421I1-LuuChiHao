package com.example.demo.service.service;


import com.example.demo.repository.service.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceService implements IServiceService{
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Page<com.example.demo.model.service.Service> getAllService(String name,
                                                                      Pageable pageable) {
        return serviceRepository.findAll(name, pageable);
    }

    @Override
    public void save(com.example.demo.model.service.Service service) {
        serviceRepository.save(service);
    }
}
