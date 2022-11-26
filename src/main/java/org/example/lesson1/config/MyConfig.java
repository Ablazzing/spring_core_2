package org.example.lesson1.config;

import org.example.lesson1.factory.Sanych;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example.lesson1.factory")
public class MyConfig {
    private Integer count = 0;

    public Integer makePlus() {
        return count++;
    }

    @Bean
    @Scope("prototype")
    public Sanych sanych() {
        makePlus();
        return new Sanych("red");
    }

}
