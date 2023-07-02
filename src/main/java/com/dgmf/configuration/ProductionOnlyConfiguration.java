package com.dgmf.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProductionOnlyConfiguration {
	@Bean
	public String dummy() {
		return "Something to Prod Configuration";
	}
}
