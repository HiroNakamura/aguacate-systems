package com.inforhomex.aguacatesys.springbootbasics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/")
public class MediatorController {

    //Nos direcciona a http://localhost:8081/app/index
	@RequestMapping
	public String getHomePage() {
		return "redirect:/app/index";
	}
}