package com.cloud.postgresql.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnProperty(name = "postgresql.url")
@EnableConfigurationProperties(PostgresqlProperties.class)
public class PostgresqlAutoConfiguration {

    @Autowired
    private PostgresqlProperties properties;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.username(properties.getUsername());
        dataSourceBuilder.password(properties.getPassword());
        dataSourceBuilder.url(properties.getUrl());
        dataSourceBuilder.driverClassName(properties.getDriverClassName());
        return dataSourceBuilder.build();
    }


}
