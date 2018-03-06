package com.jrpiassa.listatelefonica;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ListaTelefonicaApiApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(ListaTelefonicaApiApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ListaTelefonicaApiApplication.class);
	}

}
