package com.example.MakersAirBnb.MakersAirBnb;


import com.example.MakersAirBnb.MakersAirBnb.appUser.AppUser;
import com.example.MakersAirBnb.MakersAirBnb.appUser.AppUserRepository;
import com.example.MakersAirBnb.MakersAirBnb.spaces.Space;
import com.example.MakersAirBnb.MakersAirBnb.spaces.SpaceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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
	public CommandLineRunner demo(SpaceRepository repository, AppUserRepository appUserRepository) {
		return (args) -> {
			repository.deleteAll();
			appUserRepository.deleteAll();

			// save a couple of spaces
			repository.save(new Space("Sardinia 2 bed flat",
									  "London - Uk",
							          "Very beautiful flat, perfect for your vacation"));
			// save a test user
			appUserRepository.save(new AppUser("test firstname", "test lastname", "test@email.com", "testPassword"));

			// fetch all spaces.info("Spaces found with findAll():");
			log.info("-------------------------------");
			for (Space space : repository.findAll()) {
				log.info(space.toString());
			}
			log.info("");

			// fetch an individual space by ID
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
