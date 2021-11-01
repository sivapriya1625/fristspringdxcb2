package com.dxcb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Dxcb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Dxcb2Application.class, args);

		
				ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingconfi.xml");
				Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
				//Car car = new Car();
				vehicle.drive();



		

		System.out.println("hello spring");
	}

}