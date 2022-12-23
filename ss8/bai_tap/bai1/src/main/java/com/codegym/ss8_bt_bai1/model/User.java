package com.codegym.ss8_bt_bai1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotEmpty
    @NotBlank(message = "")
    @Size(min = 5,max = 45,message = "có độ dài tối thiểu 5, tối đa 45 ký tự")
    private String fistName;
    @NotEmpty
    @Size(min = 5,max = 45,message = "có độ dài tối thiểu 5, tối đa 45 ký tự")
    private String lastName;
    @Pattern(regexp = "(\\+84|0)[0-9]{9}",message = "đầu số +84 hoặc 0 và 10 số ")
    private String phoneNumber;
    @Min(value = 18,message = "Tuổi ít nhất 18")
    private Integer age;
    @Email(message="Enter valid Email Id.")
    private String email;


}
