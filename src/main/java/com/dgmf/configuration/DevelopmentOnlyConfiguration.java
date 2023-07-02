package com.dgmf.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentOnlyConfiguration {
	@Bean
	public String dummy() {
		return "Something to Dev Configuration ";
	}
}
