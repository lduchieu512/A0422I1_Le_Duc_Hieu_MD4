package com.example.casestudy_a04.repository.employeeRepository.rolesRepository;

import com.example.casestudy_a04.model.employee.roles.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRolesRepository extends JpaRepository< UserRoles,Integer> {
}
