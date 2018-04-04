package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
		@RequestMapping("/welcome")
		public String Welcome() {
			return "Hello Spring";
		}
}