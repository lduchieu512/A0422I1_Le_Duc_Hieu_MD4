package com.example.testfpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.testfpt")
@EnableTransactionManagement
@EntityScan(basePackages="com.example.testfpt")
public class TestfptApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestfptApplication.class, args);
    }

}
