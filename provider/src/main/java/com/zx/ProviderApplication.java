package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:META-INF/spring/applicationContext.xml")
@ImportResource("classpath:META-INF/spring/applicationContext.xml")
public class ProviderApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}

}
