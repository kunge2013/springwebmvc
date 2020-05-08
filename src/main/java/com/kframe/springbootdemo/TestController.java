package com.kframe.springbootdemo;

import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	TomcatWebServer t;
	@GetMapping("/hello")
	public String hello() {
		return "/hehe";
	}
}
