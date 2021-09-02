package com.efrei;

import com.efrei.data.ProgrammeurBean;
import com.efrei.service.ProgrammeurBeanRepository;
import com.efrei.service.ProgrammeurService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaJUnitApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaJUnitApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ProgrammeurBeanRepository repository, ProgrammeurService service) {
		return (args) -> {

			ProgrammeurBean linus = new ProgrammeurBean("Torvalds","Linus","2 avenue Linux Git","linuxroot","Didier Achvar","Salsa",1969,2170,50);

			repository.save(linus);

			ProgrammeurBean programmeur = repository.findByNom("Torvalds");

			service.modifierSalaireProgrammeur(programmeur, (float)9999);

			System.out.println("-------------------------------");
			System.out.println("ProgrammeurBean found with findAll():");
			for (ProgrammeurBean programmeurBean : repository.findAll()) {
				System.out.println(programmeurBean.toString());
			}

		};
	}

}
