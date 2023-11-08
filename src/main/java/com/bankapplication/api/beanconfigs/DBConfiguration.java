package com.bankapplication.api.beanconfigs;

import java.io.IOException;
import javax.sql.DataSource;

import org.hsqldb.server.Server;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@Configuration
public class DBConfiguration {
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server hsqlServer(@Value("classpath:/hsqldb.properties") Resource props) throws IOException, AclFormatException {
        Server bean = new Server();
        bean.setProperties(PropertiesLoaderUtils.loadProperties(props));
        return bean;
    }

    @Bean
    @DependsOn("hsqlServer") // This is important!!
    public DataSource getDataSource(@Autowired DataSourceProperties dsProps) {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(dsProps.getDriverClassName());
        dataSourceBuilder.url(dsProps.getUrl());
        dataSourceBuilder.username(dsProps.getUsername());
        dataSourceBuilder.password(dsProps.getPassword());
        return dataSourceBuilder.build();
    }
}
