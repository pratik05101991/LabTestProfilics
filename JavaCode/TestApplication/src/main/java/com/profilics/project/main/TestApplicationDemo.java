package com.profilics.project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.profilics")
public class TestApplicationDemo {

	public static void main(String[] args) {
		SpringApplication.run(TestApplicationDemo.class, args);
	}

}
