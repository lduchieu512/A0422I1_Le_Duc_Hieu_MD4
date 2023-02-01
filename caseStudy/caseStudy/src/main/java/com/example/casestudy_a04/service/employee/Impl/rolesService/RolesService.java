package com.example.casestudy_a04.service.employee.Impl.rolesService;

import com.example.casestudy_a04.model.employee.roles.Role;
import com.example.casestudy_a04.repository.employeeRepository.rolesRepository.IRoleRepository;
import com.example.casestudy_a04.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService implements ITypeService<Role> {
    @Autowired
    private IRoleRepository repository;
    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }
}
