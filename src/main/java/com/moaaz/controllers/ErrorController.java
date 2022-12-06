package com.moaaz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorController {

	@RequestMapping(value = "/errorController", method = RequestMethod.GET)
	public String goToErrors() {
		return "error";
	}
}
