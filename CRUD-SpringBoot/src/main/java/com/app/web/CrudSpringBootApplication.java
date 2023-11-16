package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.respositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner  {
	

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	
	@Autowired 
private EstudianteRepositorio repositorio;
	@Override
	public void run(String... args) throws Exception {
		
		/*Estudiante e1 =new Estudiante( "Carlos", "Gomez", "c12@gmail.com");
		repositorio.save(e1);
		
		Estudiante e2 =new Estudiante( "Carla", "Gomez", "c13@gmail.com");
		repositorio.save(e2);
		 
		 */
		
		
	}

}
