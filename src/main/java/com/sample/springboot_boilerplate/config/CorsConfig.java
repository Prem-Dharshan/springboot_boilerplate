package com.sample.springboot_boilerplate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.addAllowedOrigin("http://example.com");  // Replace with your allowed origin
//        corsConfiguration.addAllowedOrigin("http://another-origin.com");  // Replace with another allowed origin
//        corsConfiguration.addAllowedOriginPattern("http://*.example.com");  // Allow any subdomain of example.com

        // Allow all origins with allowedOriginPatterns
        corsConfiguration.addAllowedOriginPattern("*");

        // Allow all headers
        corsConfiguration.addAllowedHeader("*");

        // Allow all methods (GET, POST, PUT, DELETE, etc.)
        corsConfiguration.addAllowedMethod("*");

        // Allow credentials
        corsConfiguration.setAllowCredentials(true);

        // Set max age (optional)
        corsConfiguration.setMaxAge(3600L);

        // Register CORS configuration
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }
}
