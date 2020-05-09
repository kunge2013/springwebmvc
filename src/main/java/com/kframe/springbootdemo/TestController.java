package com.kframe.springbootdemo;

import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	TomcatWebServer t;
	@GetMapping("/hello")
	public String hello() {
		return "/hehe";
	}
}
