package com.ssafy.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController1 {

	
		@GetMapping("/rest1/test1")
		public String test1() {
			return "Hell REST API";
		}
		
		@GetMapping("/rest1/test2")
		@ResponseBody
		public String test2() {
			return "Hell REST API";
		}
		
		@GetMapping("/rest1/test3")
		@ResponseBody
		public Map<String, String> test3(){
			Map<String, String> data = new HashMap<>();
			data.put("id", "ssafy");
			data.put("pw","1234");
			return data;
			
		}
}
