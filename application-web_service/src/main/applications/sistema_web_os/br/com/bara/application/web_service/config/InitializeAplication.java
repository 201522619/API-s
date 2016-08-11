package br.com.bara.application.web_service.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitializeAplication {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicio(){
		return "index";
	}

}
