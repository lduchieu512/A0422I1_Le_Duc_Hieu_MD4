package com.example.ss4_bt_bai1.repository.Impl;

import com.example.ss4_bt_bai1.bean.Mail;
import com.example.ss4_bt_bai1.repository.IMailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository  implements IMailRepository {
    static Mail saveMmail= new Mail("English",10,false,"Lê Đức Hiệu ");


    @Override
    public Mail finAll() {
        return saveMmail;
    }

    @Override
    public Mail update(Mail mail) {
        saveMmail.setLanguage(mail.getLanguage());
        saveMmail.setPageSize(mail.getPageSize());
        saveMmail.setAllowSpam(mail.isAllowSpam());
        saveMmail.setSignature(mail.getSignature());
        return saveMmail;
    }
}
