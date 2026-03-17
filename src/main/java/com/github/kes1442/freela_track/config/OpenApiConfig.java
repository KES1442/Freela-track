package com.github.kes1442.freela_track.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(new Info()
                    .title("FreelaTrack API")
                    .version("v1")
                    .description("Backend API for managing freelance jobs, payments and deadlines.")
                    .license(new License().name("Apache 2.0")));
}
}
