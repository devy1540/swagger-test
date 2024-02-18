package com.example.swaggertest.global;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@OpenAPIDefinition
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi domainAAPI() {
        return GroupedOpenApi.builder()
                .group("domainA")
                .pathsToMatch("/A/**")
                .build();
    }
}
