package com.example.casestudy_a04.repository.mainServiceRepository;

import com.example.casestudy_a04.model.MainService.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentTypeRepository extends JpaRepository< RentType,Integer> {
}
