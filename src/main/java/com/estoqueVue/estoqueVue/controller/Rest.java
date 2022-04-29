package com.estoqueVue.estoqueVue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Rest {

	@GetMapping("/")
	public String rest() {
		return("rest");
	}
}
