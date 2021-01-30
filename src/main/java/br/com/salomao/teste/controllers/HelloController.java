package br.com.salomao.teste.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class HelloController {
	
	@GetMapping("/ola")
	@ResponseBody
	public String hello() {
		return "olá mundo";
	}

}
