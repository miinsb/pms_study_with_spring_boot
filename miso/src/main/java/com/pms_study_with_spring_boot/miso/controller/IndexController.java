package com.pms_study_with_spring_boot.miso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/index")
	public String index() {
		System.out.println("인덱스 페이지 입니다.");
		return "index";
	}
	
	
	@GetMapping("/about")
	public String about() {
		System.out.println("어바웃 페이지 입니다.");
		return "about";
	}
}
