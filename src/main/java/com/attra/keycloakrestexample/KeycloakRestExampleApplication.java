package com.attra.keycloakrestexample;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeycloakRestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakRestExampleApplication.class, args);
	}

	 //Creating bean keycloakConfigResolver
    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}
