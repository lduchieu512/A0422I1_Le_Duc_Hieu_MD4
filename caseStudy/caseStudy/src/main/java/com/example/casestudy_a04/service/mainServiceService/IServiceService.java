package com.example.casestudy_a04.service.mainServiceService;

import com.example.casestudy_a04.model.MainService.MainService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sun.applet.Main;

import java.util.List;

public interface IServiceService {
    Page<MainService> findAllService(Pageable pageable);
    List<MainService> findAllList();
    void insertMainService(MainService mainService);
    void updateMainService(MainService mainService);
    void deleteMainService(String id);
    MainService selectMainService(String id);
    Page<MainService> searchService(String nameSearch, String rentTypeSearch, String typeSearch, Pageable pageable);


}
