package com.marte.companies_crud.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Companies CRUD",
                version = "1.0.0",
                description = "Crud for managing companies"

        )
)
public class OpenApiConfig {
}
