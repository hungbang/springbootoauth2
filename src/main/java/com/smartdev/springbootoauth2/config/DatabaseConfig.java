package com.smartdev.springbootoauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages ="com.smartdev.springbootoauth2.repository" )
//public class DatabaseConfig {

//    @Bean
//    public DataSource dataSource(){
//        EmbeddedDatabaseBuilder databaseBuilder = new EmbeddedDatabaseBuilder();
//        EmbeddedDatabase database = databaseBuilder.setType(EmbeddedDatabaseType.H2)
//                .addScript("schema.sql")
//                .addScript("import.sql")
//                .build();
//
//        return database;
//    }

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(@Qualifier("dataSource") DataSource ds){
//        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setDataSource(ds);
//        bean.setPackagesToScan(new String[]{"com.smartdev.springbootoauth2.domain"});
//        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        bean.setJpaVendorAdapter(vendorAdapter);
//        return bean;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory factory){
//        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//        jpaTransactionManager.setEntityManagerFactory(factory);
//        return jpaTransactionManager;
//    }

//}
