package com.javakc.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Mr.Chen
 * @discription
 * @date 2020/11/23 16:43
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.javakc"})
@EnableJpaAuditing
public class PmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class,args);
    }
}
