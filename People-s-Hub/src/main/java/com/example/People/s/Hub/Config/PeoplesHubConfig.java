package com.example.People.s.Hub.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition
@Configuration
public class PeoplesHubConfig {

	@Bean
	public OpenAPI base()
	{
		return new OpenAPI().info(new Info().title("Peoples Hub")
				.version("1.0.0").description("Company Project"));
	}
}
