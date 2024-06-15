package com.example.multidb.config;

import jdk.jshell.execution.LocalExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "masterDataEntityManagerFactoryBean",
        basePackages = {"com.example.multidb.repository.MasterDataRepository"},
        transactionManagerRef = "masterDataTransactionManager"
)
public class MasterDataConfig {

    @Autowired
    private Environment environment;

    @Bean
    @Primary
    public DataSource masterDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("spring.datasource.db1.url"));
        dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("spring.datasource.db1.driver-class-name")));
        dataSource.setUsername(environment.getProperty("spring.datasource.db1.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.db1.password"));

        return dataSource;
    }

    @Bean(name = "masterDataEntityManagerFactoryBean")
    @Primary
    public LocalContainerEntityManagerFactoryBean masterDataEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(masterDataSource());

        JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        bean.setJpaVendorAdapter(adapter);

        Map<String,String> props = new HashMap<>();
        props.put("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
        props.put("hibernate.hbm2ddl.auto","update");

        bean.setJpaPropertyMap(props);
        bean.setPackagesToScan(new String[]{"com.example.multidb.model"});
        return bean;
    }

    @Primary
    @Bean(name = "masterDataTransactionManager")
    public PlatformTransactionManager masterDataTransactionManager(){
        JpaTransactionManager manager = new JpaTransactionManager();
        manager.setEntityManagerFactory(masterDataEntityManagerFactoryBean().getObject());
        return manager;
    }
}
