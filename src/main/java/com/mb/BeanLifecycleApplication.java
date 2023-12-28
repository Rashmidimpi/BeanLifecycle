package com.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mb.beans.Car;

@SpringBootApplication
public class BeanLifecycleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 	
		SpringApplication.run(BeanLifecycleApplication.class, args);
		Car bean = context.getBean(Car.class);
		bean.start();
	}

}
