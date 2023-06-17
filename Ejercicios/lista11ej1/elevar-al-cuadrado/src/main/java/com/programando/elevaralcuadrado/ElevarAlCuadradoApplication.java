package com.programando.elevaralcuadrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
@RequestMapping("/numero")
public class ElevarAlCuadradoApplication {

	@GetMapping
	public String explicacion(){
		return "Ingrese /(número) en el link";
	}

	@GetMapping("/{numero}")
	public int elevarAlCuadrado(@PathVariable int numero){
		return numero * numero;
	}
	public static void main(String[] args) {
		SpringApplication.run(ElevarAlCuadradoApplication.class, args);
	}

}
