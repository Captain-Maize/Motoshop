package com.motoshop.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.motoshop.client.*", "com.motoshop.client" })
@EnableJpaRepositories(basePackages = { "com.motoshop.client.*" })
@EntityScan({ "com.motoshop.common.*" })
public class FrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

}



