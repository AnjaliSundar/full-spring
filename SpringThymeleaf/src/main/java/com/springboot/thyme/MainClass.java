package com.springboot.thyme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
/*@ComponentScan(basePackages= {"com.springboot.watertank.controller"})
@EnableJpaRepositories(basePackages= {"com.springboot.watertank.repository"})
@EntityScan(basePackages= {"com.springboot.watertank.entity"})*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainClass.class, args);
	}
}
