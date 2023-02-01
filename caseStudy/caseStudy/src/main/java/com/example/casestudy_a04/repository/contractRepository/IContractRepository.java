package com.example.casestudy_a04.repository.contractRepository;

import com.example.casestudy_a04.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract,Integer> {
}
