package com.example.ss12_th_bai2.repository;

import com.example.ss12_th_bai2.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone,Long> {
}
