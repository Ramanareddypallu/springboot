package com.jsp.userspringm8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("/first")
	public String firstApi() {
		return "Yeah i have created my first Api";
	}

}
