package myweb.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController{
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
