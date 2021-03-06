package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:META-INF/spring/applicationContext.xml")
public class CustomerApplication {


	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
