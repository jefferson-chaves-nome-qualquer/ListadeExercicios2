package br.edu.ifpr.foz.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

	@GetMapping("/nao-fazer")
	public String hello() {
		return "Hello World!";
	}

}
