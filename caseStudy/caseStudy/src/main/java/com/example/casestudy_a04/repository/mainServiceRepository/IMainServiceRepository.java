package com.example.casestudy_a04.repository.mainServiceRepository;

import com.example.casestudy_a04.model.MainService.MainService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IMainServiceRepository extends JpaRepository< MainService,String> {
    @Query(value = "select * from service where service_name like ? and rent_type_id like ? and service_type_id like ?", nativeQuery = true)
    Page<MainService> searchService(String name, String rentType, String type, Pageable pageable);
}
