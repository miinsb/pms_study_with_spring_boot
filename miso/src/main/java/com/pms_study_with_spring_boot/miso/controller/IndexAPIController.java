package com.pms_study_with_spring_boot.miso.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexAPIController {
	@GetMapping("/index/api/{name}/{age}")
	public String index(@PathVariable String name, @PathVariable int age) {
		String jsonData = "{\"name\":\"John Doe\",\"age\":30,\"email\":\"johndoe@example.com\",\"address\":{\"street\":\"123 Main Street\",\"city\":\"New York\",\"state\":\"NY\",\"zipcode\":\"10001\"},\"hobbies\":[\"reading\",\"traveling\",\"cooking\"],\"active\":true}";
		String result = "안녕하세요? " + name + "의 나이는 " + age + "입니다.";
//		return jsonData;
		return result;
	}
	
	
	@PostMapping("/index2/api")
	public String index2(@RequestBody Map<String, Object> mapData) {
		System.out.println("name : " + mapData.get("name").toString());
		System.out.println("age : " + mapData.get("age").toString());
		
		String name = mapData.get("name").toString();
		String age = mapData.get("age").toString();
		String result = "안녕하세요? " + name + "의 나이는 " + age + "입니다.";
		
		return result;
	}
}
