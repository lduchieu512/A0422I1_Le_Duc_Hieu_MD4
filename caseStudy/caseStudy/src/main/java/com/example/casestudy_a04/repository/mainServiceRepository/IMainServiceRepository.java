package com.example.casestudy_a04.repository.mainServiceRepository;

import com.example.casestudy_a04.model.MainService.MainService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMainServiceRepository extends JpaRepository< MainService,Integer> {
}
