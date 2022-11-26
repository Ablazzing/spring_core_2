package org.example.homework.config;

import org.example.homework.storage.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.homework")
public class MyConfig {

    @Bean
    public Employee mishka() {
        return new Employee();
    }

    @Bean
    public Employee zelya() {
        return new Employee();
    }
}
