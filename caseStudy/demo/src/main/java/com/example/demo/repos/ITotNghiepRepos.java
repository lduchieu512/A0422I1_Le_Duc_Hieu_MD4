package com.example.demo.repos;

import com.example.demo.model.TotNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ITotNghiepRepos extends JpaRepository<TotNghiep,Integer> {
    @Query("select t from TotNghiep  t")
    Iterable<TotNghiep> findAllTotNghiep();


}
