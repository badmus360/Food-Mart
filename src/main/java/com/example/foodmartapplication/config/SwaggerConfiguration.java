package com.example.foodmartapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customizeOpenApi(){
        final String securitySchemaName = "bearerAuth";
        return new OpenAPI()
                .info(new Info()
                        .title("Food Mart App API")
                        .version("1.1")
                        .description("Food Mart App API Documentation")
                )
                .addSecurityItem(new SecurityRequirement().addList(securitySchemaName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemaName, new SecurityScheme()
                                .name(securitySchemaName)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}
