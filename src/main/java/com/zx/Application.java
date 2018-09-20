package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ZX on 2018/9/20.
 *
 * @param
 * @return
 */
@SpringBootApplication  //该注解可看做@EnableAutoConfiguration和@ComponentScan复合而来
//@EnableAutoConfiguration
//@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}