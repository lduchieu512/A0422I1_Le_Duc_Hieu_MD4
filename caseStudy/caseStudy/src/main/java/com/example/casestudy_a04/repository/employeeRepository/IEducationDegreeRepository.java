package com.example.casestudy_a04.repository.employeeRepository;

import com.example.casestudy_a04.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationDegreeRepository extends JpaRepository< EducationDegree,Integer> {
}
