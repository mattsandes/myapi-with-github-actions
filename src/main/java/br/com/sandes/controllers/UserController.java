package br.com.sandes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sandes.services.UserServices;

@RestController
@RequestMapping(name = "/myapi")
public class UserController {
	
	@Autowired
	private UserServices services;

	@GetMapping
	public List<String> findAll(){
		return services.findAll();
	}
}
