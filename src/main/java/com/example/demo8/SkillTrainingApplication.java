package com.example.demo8;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo8.mapper")
public class SkillTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillTrainingApplication.class, args);
    }

}
