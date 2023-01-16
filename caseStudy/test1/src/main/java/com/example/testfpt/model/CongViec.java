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
public class CongViec {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date NgayVao;

    private String tenCV;
    private String tenCty;
    private String diaChiCty;
    private Integer thoigian;

    @Id
    @ManyToOne
    @JoinColumn(name = "SoCMND", nullable = false, referencedColumnName = "SoCMND")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "maNganh", nullable = false, referencedColumnName = "maNganh")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    Nganh nganh;
}
