package com.example.casestudy_a04.service.employee.Impl.rolesService;

import com.example.casestudy_a04.model.employee.roles.User;
import com.example.casestudy_a04.repository.employeeRepository.rolesRepository.IUserRepository;
import com.example.casestudy_a04.service.employee.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository repository;
    @Override
    public Optional<User> findByUserNameAndPassword(String username, String password) {
        return Optional.empty();
    }
}
