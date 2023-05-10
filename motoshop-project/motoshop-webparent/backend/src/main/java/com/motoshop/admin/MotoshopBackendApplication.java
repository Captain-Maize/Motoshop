package com.motoshop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.motoshop.admin.*", "com.motoshop.admin" })
@EnableJpaRepositories(basePackages = { "com.motoshop.admin.*" })
@EntityScan({ "com.motoshop.common.*" })
public class MotoshopBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotoshopBackendApplication.class, args);
	}

}
