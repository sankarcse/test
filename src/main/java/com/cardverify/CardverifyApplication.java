package com.cardverify;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardverifyApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CardverifyApplication.class, args);
	}
	
	

}
