package com.example.multidb.config;

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
        entityManagerFactoryRef = "portfolioEntityManagerFactoryBean",
        basePackages = {"com.example.multidb.repository.PortfolioRepository"},
        transactionManagerRef = "portfolioTransactionManager"
)
public class PortfolioConfig {

    @Autowired
    private Environment environment;

    @Bean
    @Primary
    public DataSource portfolioDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("spring.datasource.db2.url"));
        dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("spring.datasource.db2.driver-class-name ")));
        dataSource.setUsername(environment.getProperty("spring.datasource.db2.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.db2.password"));

        return dataSource;
    }

    @Bean(name = "portfolioEntityManagerFactoryBean")
    @Primary
    public LocalContainerEntityManagerFactoryBean portfolioEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(portfolioDataSource());

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
    @Bean(name = "portfolioTransactionManager")
    public PlatformTransactionManager portfolioTransactionManager(){
        JpaTransactionManager manager = new JpaTransactionManager();
        manager.setEntityManagerFactory(portfolioEntityManagerFactoryBean().getObject());
        return manager;
    }

}
