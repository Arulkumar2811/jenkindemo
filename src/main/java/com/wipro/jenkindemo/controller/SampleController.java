package com.wipro.jenkindemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("/jenkin")
public class SampleController {

	@GetMapping
	public String homePage() {
		return "this is Demo Jenkin-Docker Home";
	}
}
