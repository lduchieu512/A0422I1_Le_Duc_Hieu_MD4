package com.example.casestudy_a04.repository.employeeRepository;

import com.example.casestudy_a04.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository< Employee,Integer> {
    @Query(value = "select * from Employee where employee_name like ? and employee_email like ? and divisionid like ?", nativeQuery = true)
    Page<Employee> searchEmployee(String name, String email, String divisionId, Pageable pageable);
}
