package com.valleytech.DiffConfigurationAndAutoConfiguration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@AutoConfiguration
public class DemoComponent
{

    public void show()
    {
        System.out.println("DemoComponent:show is called");
    }

}
