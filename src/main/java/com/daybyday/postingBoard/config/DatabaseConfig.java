package com.daybyday.postingBoard.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {


    @ConfigurationProperties(prefix = "spring.datasource")  // application properties 파일 prefix
    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }


}


