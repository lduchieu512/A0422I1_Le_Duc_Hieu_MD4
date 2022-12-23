package com.codegym.ss8_bt_bai1.repository;

import com.codegym.ss8_bt_bai1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
