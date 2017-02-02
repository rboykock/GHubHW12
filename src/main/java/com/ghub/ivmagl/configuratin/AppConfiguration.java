package com.ghub.ivmagl.configuratin;

import com.ghub.ivmagl.components.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.ghub.ivmagl")
@PropertySource(value = {"classpath:app.properties"})
public class AppConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Car car() {
        return new Car(wheels(), engine());
    }

    @Bean(initMethod = "init")
    public Engine engine(){
        return new Engine();
    }

    @Bean
    public Wheel wheels() {
        return new Wheel(tyres());
    }

    @Bean
    public Tyres tyres() {
        return new SummerTyres();
    }
}
