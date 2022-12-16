package com.example.ss4_bt_bai1.repository;

import com.example.ss4_bt_bai1.bean.Mail;

public interface IMailRepository {
    Mail finAll();
    Mail update(Mail mail);
}
