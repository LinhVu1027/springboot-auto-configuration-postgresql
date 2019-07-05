package com.cloud.postgresql.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "postgresql")
public class PostgresqlProperties {
    private String username;
    private String password;
    private String url;
    private String driverClassName;
}
