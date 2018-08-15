package com.shadab.grocery.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan("com.shadab")
@ImportResource("classpath:app-config.xml")
@SpringBootApplication
public class GroceryApp  {



	public static void main(String[] args) throws Exception {
		SpringApplication.run(GroceryApp.class, args);
	}
}