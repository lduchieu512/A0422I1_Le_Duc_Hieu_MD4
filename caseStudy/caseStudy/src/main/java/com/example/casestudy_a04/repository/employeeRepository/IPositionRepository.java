package com.example.casestudy_a04.repository.employeeRepository;

import com.example.casestudy_a04.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends JpaRepository< Position,Integer> {
}
