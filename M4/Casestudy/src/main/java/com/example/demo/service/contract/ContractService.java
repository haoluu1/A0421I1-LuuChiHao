package com.example.demo.service.contract;

import com.example.demo.model.contract.Contract;
import com.example.demo.repository.contract.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService{
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Page<Contract> getAllContract(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public Contract findById(int id) {
        return contractRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        Contract contract = contractRepository.findById(id).orElse(null);
        if (contract != null){
            contractRepository.delete(contract);
        }
    }
}
