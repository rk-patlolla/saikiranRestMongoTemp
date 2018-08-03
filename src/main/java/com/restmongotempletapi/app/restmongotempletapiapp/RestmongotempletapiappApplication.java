package com.restmongotempletapi.app.restmongotempletapiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.restmongotempletapi.app")
@EntityScan(basePackages = "com.restmongotempletapi.app")
public class RestmongotempletapiappApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RestmongotempletapiappApplication.class, args);
	}
}
