package com.example.dbpmkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.dbpmkk.Repository")
@EntityScan(basePackages = "com.example.dbpmkk.Domain")
public class DbpMkkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbpMkkApplication.class, args);
    }

}
