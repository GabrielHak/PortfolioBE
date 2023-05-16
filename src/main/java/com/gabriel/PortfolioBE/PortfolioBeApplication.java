package com.gabriel.PortfolioBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration(proxyBeanMethods = false)
@SpringBootApplication
public class PortfolioBeApplication {

    public static void main(String[] args) {
            SpringApplication.run(PortfolioBeApplication.class, args);
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return (new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                        registry.addMapping("/**")
                                .allowedOrigins("*")
                                .allowedMethods("*")
                                .allowedHeaders("*");
                }
        });
    }
}
