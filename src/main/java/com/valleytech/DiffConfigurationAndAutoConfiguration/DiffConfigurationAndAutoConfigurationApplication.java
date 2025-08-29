package com.valleytech.DiffConfigurationAndAutoConfiguration;

import com.valleytech.cutomautoconfi.AutoCustomConfig;
import com.valleytech.cutomautoconfi.CustomCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

//first priority
//@SpringBootApplication
//@Import(CustomCourse.class)
//Second Priority
//@SpringBootApplication(scanBasePackages = {
//		"com.valleytech.DiffConfigurationAndAutoConfiguration",
//		"com.valleytech.cutomautoconfi"
//})
@SpringBootApplication
public class DiffConfigurationAndAutoConfigurationApplication  implements CommandLineRunner
{

	@Autowired
	ApplicationContext container;
	public static void main(String[] args) {
		SpringApplication.run(DiffConfigurationAndAutoConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CustomCourse customCourse=	container.getBean(CustomCourse.class);
		customCourse.show();

	}
}
