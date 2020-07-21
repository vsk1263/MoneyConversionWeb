package com.example.MoneyConversionWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.webService.*","com.example.MoneyConversionWeb.*"})
public class MoneyConversionWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyConversionWebApplication.class, args);
	}

}