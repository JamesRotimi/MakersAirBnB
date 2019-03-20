package com.example.MakersAirBnb.MakersAirBnb;


import com.example.MakersAirBnb.MakersAirBnb.spaces.Space;
import com.example.MakersAirBnb.MakersAirBnb.spaces.SpaceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class MakersAirBnbApplication {

	private static final Logger log = LoggerFactory.getLogger(MakersAirBnbApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MakersAirBnbApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(SpaceRepository repository) {
		return (args) -> {
			repository.deleteAll();

			// save a couple of spaces
			repository.save(new Space("Sardinia 2 bed flat"));
			repository.save(new Space("london flat, 3 rooms"));
			repository.save(new Space("Sadalsjidalijdasjdalj"));


			// fetch all users.info("Spaces found with findAll():");
			log.info("-------------------------------");
			for (Space space : repository.findAll()) {
				log.info(space.toString());
			}
			log.info("");

			// fetch an individual user by ID
			repository.findById(1L)
					.ifPresent(space -> {
						log.info("User found with findById(1L):");
						log.info("--------------------------------");
						log.info(space.toString());
						log.info("");
					});

			log.info("");
		};
	}
}
