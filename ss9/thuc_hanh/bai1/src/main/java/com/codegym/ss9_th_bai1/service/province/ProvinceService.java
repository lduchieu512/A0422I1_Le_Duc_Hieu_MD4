package com.codegym.ss9_th_bai1.service.province;


import com.codegym.ss9_th_bai1.model.Customer;
import com.codegym.ss9_th_bai1.model.Province;
import com.codegym.ss9_th_bai1.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll()throws Exception {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id)throws Exception {
        return provinceRepository.findById(id);
    }

    @Override
    public Customer save(Province province)throws Exception {
        provinceRepository.save(province);
        return null;
    }

    @Override
    public void remove(Long id)throws Exception {
        provinceRepository.deleteById(id);
    }
}
