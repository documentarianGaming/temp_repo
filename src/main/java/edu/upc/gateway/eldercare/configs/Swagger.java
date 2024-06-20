package edu.upc.gateway.eldercare.configs;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Eldercare Gateway",
                version = "1.0.0",
                description = "Backend COnfiguration for ElderlyCare gateway API."
        )
)
public class Swagger {

}
