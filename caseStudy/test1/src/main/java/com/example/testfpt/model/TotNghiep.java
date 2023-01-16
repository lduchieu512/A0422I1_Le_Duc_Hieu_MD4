package com.example.testfpt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TotNghiep {

    @Id
    @ManyToOne
    @JoinColumn(name = "SoCMND", nullable = false, referencedColumnName = "SoCMND")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    SinhVien sinhVien;

    private Date NgayTN;

    private String heTN;

    private String loaiTN;
    @Id
    @ManyToOne
    @JoinColumn(name = "maNganh", nullable = false, referencedColumnName = "maNganh")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    Nganh nganh;

    @Id
    @ManyToOne
    @JoinColumn(name = "idTruong", nullable = false, referencedColumnName = "idTruong")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    Truong truong;
}
