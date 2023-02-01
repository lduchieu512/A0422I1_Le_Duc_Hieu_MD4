package com.example.casestudy_a04.repository.employeeRepository.rolesRepository;

import com.example.casestudy_a04.model.employee.roles.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Integer> {
}
