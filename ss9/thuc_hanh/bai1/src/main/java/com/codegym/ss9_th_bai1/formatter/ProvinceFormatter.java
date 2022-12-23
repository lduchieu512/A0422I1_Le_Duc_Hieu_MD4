package com.codegym.ss9_th_bai1.formatter;

import com.codegym.ss9_th_bai1.model.Province;
import com.codegym.ss9_th_bai1.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

@Component
public class ProvinceFormatter implements Formatter<Province>  {
    private IProvinceService provinceService;

    @Autowired
    public ProvinceFormatter(IProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        try {
            Optional<Province> provinceOptional = provinceService.findById(Long.parseLong(text));
            return provinceOptional.orElse(null);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
