package com.xoolibeut.ndeki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.xoolibeut.ndeki.dao.PartenaireRepository;
import com.xoolibeut.ndeki.entities.Partenaire;
@ComponentScan
@SpringBootApplication
public class NdekiServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NdekiServerApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(PartenaireRepository repository) {
		return args -> {
			Partenaire partenaire = new Partenaire();
			partenaire.setNom("First partenaire");
			repository.save(partenaire);
			partenaire = new Partenaire();
			partenaire.setNom("Second Partenaire partenaire");
			repository.save(partenaire);
		};
	}
}
