package com.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
	
	@GetMapping("/Messagr")
	public String getMessage() {
		return "Hello Anusaya you successfully learn Jenkins.very nice";
	}

}
