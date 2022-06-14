package com.example.demo.service.contract;

import com.example.demo.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> getAllContract(Pageable pageable);

    void save(Contract contract);

    Contract findById(int id);

    void delete(int id);
}
