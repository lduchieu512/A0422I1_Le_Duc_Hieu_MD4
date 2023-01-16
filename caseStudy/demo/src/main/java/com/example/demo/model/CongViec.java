package com.example.demo.model;

import io.micrometer.core.annotation.Counted;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "congViec")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CongViec {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ngayvaocty")
    private Date NgayVao;

    @Column(name = "tencongviec")
    private String tenCV;
    @Column(name = "tencty")
    private String tenCty;
    @Column(name = "diachicty")
    private String diaChiCty;

    @Column(name = "thoigianlamviec")
    private Integer thoigian;

    @ManyToOne
    @JoinColumn(name = "SoCMND", nullable = false, referencedColumnName = "SoCMND")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "maNganh", nullable = false, referencedColumnName = "maNganh")
    @Cascade(value = {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    Nganh nganh;
}
