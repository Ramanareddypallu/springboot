package com.jsp.userspringm8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecounController {
	@RequestMapping("/secound")
	public String secoundApi() {
		return " secound api created";
	}

}
