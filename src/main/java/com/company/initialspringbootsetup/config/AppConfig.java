package com.company.initialspringbootsetup.config;

import com.company.initialspringbootsetup.config.properties.AppProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

/**
 *
 */

@Configuration
@EnableConfigurationProperties(AppProperties.class)
public class AppConfig
{
    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
}
