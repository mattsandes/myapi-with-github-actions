package br.com.sandes.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServices {

	public List<String> findAll(){
		return List.of("Hello", "World");
	}
}
