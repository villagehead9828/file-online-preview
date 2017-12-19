package com.yudianbank.web.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test01")
	public String test01(String url, String needEncode, Model model) {
		Date d = new Date();
		System.out.println(d);
		return "test";
	}
}
