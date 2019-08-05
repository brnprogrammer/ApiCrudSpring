package br.com.api.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody // para que a request nao procure uma pagina jsp/tymeleaf e sim a string
	public String hello() {
		return "HelloWorld!";
	}

}
