package com.example.demo.repository.contract;

import com.example.demo.model.contract.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
