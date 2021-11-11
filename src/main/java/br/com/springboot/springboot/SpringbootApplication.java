package br.com.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}


// antes de executar tenho que utilizar o bash o comando mvn install
// para executar a aplicação é mvn spring-boot:run
