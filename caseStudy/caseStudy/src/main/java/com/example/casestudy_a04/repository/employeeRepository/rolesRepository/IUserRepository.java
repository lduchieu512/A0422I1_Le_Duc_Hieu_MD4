package com.example.casestudy_a04.repository.employeeRepository.rolesRepository;

import com.example.casestudy_a04.model.employee.roles.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository< User,Integer> {
}
