package com.codegym.ss8_bt_bai1.service;

import com.codegym.ss8_bt_bai1.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void save(User user);
    void delete(Integer id);
    User findById(Integer id);
}
