package com.example.dl;

import com.example.dl.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class DistanceLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistanceLearningApplication.class, args);
	}

}
