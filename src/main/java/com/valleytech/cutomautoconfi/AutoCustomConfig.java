package com.valleytech.cutomautoconfi;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@AutoConfiguration
public class AutoCustomConfig {

    @Bean
    public CustomCourse getCustomCourse()
    {
       return  new CustomCourse();
    }

}