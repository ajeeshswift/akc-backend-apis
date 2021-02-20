package com.swift.akc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.swift.akc.security.Profile.BASIC_AUTH;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/json"));

  private ApiInfo apiInfo() {
    ApiInfo apiInfo = new ApiInfo("GRH REST API", "API list for GRH service.", "1.0", "",
        new Contact("Swiftware solutions Dev Team", "", "support@gmail.com"), "License of API", "",
        Collections.emptyList());
    return apiInfo;
  }

  @Bean
  public Docket api() {
    List<SecurityContext> securityContexts = new ArrayList<>();
    securityContexts.add(securityContext());
    return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.basePackage("com.swift"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo())
            .securitySchemes(securitySchemes())
            .securityContexts(securityContexts);
  }


  private List<SecurityScheme> securitySchemes() {
    List<SecurityScheme> securitySchemas = new ArrayList<>();
    securitySchemas.add(new BasicAuth(BASIC_AUTH));
    return securitySchemas;
  }

  private SecurityContext securityContext() {
    return SecurityContext.builder().securityReferences(Arrays.asList(basicAuthReference())).forPaths(PathSelectors.any()).build();
  }

  private SecurityReference basicAuthReference() {
    return new SecurityReference(BASIC_AUTH, new AuthorizationScope[0]);
  }
}