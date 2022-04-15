package com.claudio.desafioCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.claudio.desafioCrud.Controller")
@ComponentScan ("com.claudio.desafioCrud.Service")
@ComponentScan ("com.claudio.desafioCrud.InterfaceService")
@EntityScan("com.claudio.desafioCrud.Modelo")
@EnableJpaRepositories("com.claudio.desafioCrud.RepositoryPersona")
public class DesafioCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioCrudApplication.class, args);
	}

}
