package com.example.springboot.config;

import com.example.springboot.profile.DevProfile;
import com.example.springboot.profile.ProductionProfile;
import com.example.springboot.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(value = "dev",havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "prod",havingValue = "true")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
