package com.programando.verificaruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/login")
public class VerificarUserApplication {

	@GetMapping
	public String explicacion(){
		return "Ingrese /(nombre de usuario) en el link";
	}

	@GetMapping("/{user}")
	public boolean verificarUser(@PathVariable String user){
		return user.equals("admin");
	}

	public static void main(String[] args) {
		SpringApplication.run(VerificarUserApplication.class, args);
	}

}
