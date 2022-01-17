package com.mzj.thebook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mzj.thebook.dao")
public class ThebookApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThebookApplication.class, args);
    }

}
