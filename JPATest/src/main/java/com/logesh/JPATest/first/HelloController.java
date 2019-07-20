package com.logesh.JPATest.first;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("hello/{name}")
	public String greet(@PathVariable String name) {
		return "Hello User! " + name;
	}
}
