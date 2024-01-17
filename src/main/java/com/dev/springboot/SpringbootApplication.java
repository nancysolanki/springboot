package com.dev.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext object=SpringApplication.run(SpringbootApplication.class, args);
		
		Alien a= object.getBean(Alien.class);
		a.show();
		Alien a1= object.getBean(Alien.class);
		a1.show();

		System.out.println("Boot");
	}

}
