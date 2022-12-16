package com.example.ss4_bt_bai1.service.Impl;

import com.example.ss4_bt_bai1.bean.Mail;
import com.example.ss4_bt_bai1.repository.IMailRepository;
import com.example.ss4_bt_bai1.repository.Impl.MailRepository;
import com.example.ss4_bt_bai1.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MailService implements IMailService {
    @Autowired
    IMailRepository mailRepository = new MailRepository();


    @Override
    public Mail findAll() {
        return mailRepository.finAll();
    }

    @Override
    public Mail update(Mail mail) {
        return mailRepository.update(mail);
    }
}
