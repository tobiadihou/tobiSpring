package com.adihou.tobi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.adihou.tobi.config.ApplicationProperties;

@SpringBootApplication()
@EnableConfigurationProperties({
	ApplicationProperties.class,LiquibaseProperties.class
})

public class TobiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TobiApplication.class, args);
	}

}
