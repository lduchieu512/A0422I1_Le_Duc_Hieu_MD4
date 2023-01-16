package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "totNghiep")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TotNghiep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;

    @OneToOne
    @JoinColumn(name = "SoCMND", nullable = false, referencedColumnName = "SoCMND")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    SinhVien sinhVien;

    @Column(name = "ngayTN")
    private Date NgayTN;

    @Column(name = "heTN")
    private String heTN;

    @Column(name = "loaiTN")
    private String loaiTN;

    @ManyToOne
    @JoinColumn(name = "manganh", nullable = false, referencedColumnName = "maNganh")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    Nganh nganh;

    @ManyToOne
    @JoinColumn(name = "matruong", nullable = false, referencedColumnName = "maTruong")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    Truong truong;
}
