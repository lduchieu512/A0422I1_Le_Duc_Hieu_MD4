package com.example.casestudy_a04.repository.mainServiceRepository;

import com.example.casestudy_a04.model.MainService.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeRepository extends JpaRepository< ServiceType,Integer> {
}
