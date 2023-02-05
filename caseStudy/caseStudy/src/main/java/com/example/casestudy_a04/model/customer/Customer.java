package com.example.casestudy_a04.model.customer;

import com.sun.istack.NotNull;
import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Empty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator",
            parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "KH"),
            strategy = "com.example.casestudy_a04.model.MyGenerator")
    @Column(length = 45)
    private String  customerId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_type_id",nullable = false)
    private CustomerType customerTypeId;

    @NotNull
    @Column(nullable = false,length = 45)
    private String customerName;
    @NotNull
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(nullable = false)
    private Date customerBirthday;

    @NotNull
    @Column(nullable = false)
    private Boolean customerGender;

    @NotNull
    @Column(nullable = false,length = 45)
    @Pattern(regexp = "[0-9]{9}|[0-9]{12}", message = "{idCard}")
    private String customerIdCard;

    @NotNull
    @Column(nullable = false,length = 45)
    @Pattern(regexp = "(0[9][0-9]{8})|((84)+[9][0-9]{8})",message = "{phone}")
    private String customerPhone;

    @Email(message = "{email}")
    @Column(nullable = true,length = 45)
    private String customerEmail;

    @NotNull
    @Column(nullable = true,length = 45)
    private String customerAddress;
}
