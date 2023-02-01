package com.example.casestudy_a04.service.employee;

import com.example.casestudy_a04.model.employee.roles.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUserNameAndPassword(String username , String password);

}
