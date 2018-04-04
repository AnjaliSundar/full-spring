package com.springboot.watertank.controller;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface WaterRepository extends CrudRepository<User, Integer> {

	public void save(UseWater usewater);

	//edit
	//delete
	//create

	
}