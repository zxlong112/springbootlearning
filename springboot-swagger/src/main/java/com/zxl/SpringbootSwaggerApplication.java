package com.zxl;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class SpringbootSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwaggerApplication.class, args);
    }

}

