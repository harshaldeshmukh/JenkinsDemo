package com.DockerDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerClass {
	
	@GetMapping("/")
	public String name() {
		return "This is Heloow class  .New Demo zcz ";
	}

}
