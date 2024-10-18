package com.api.travel.common.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(title = "Traver Service API",
        description = "여행 서비스 API 규격서",
        version = "v1"))
@SecurityScheme(type = SecuritySchemeType.HTTP, name = "bearerAuth", scheme = "bearer")
@SecurityScheme(type = SecuritySchemeType.HTTP, name = "basicAuth", scheme = "basic")
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi chatOpenApi() {
        String[] paths = {"/**"};
        return GroupedOpenApi.builder()
            .group("Traver API v1")
            .pathsToMatch(paths)
            .build();
    }

}
