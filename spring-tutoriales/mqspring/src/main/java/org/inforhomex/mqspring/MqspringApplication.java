package org.inforhomex.mqspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.inforhomex.mqspring.model.Pojo;


@EnableAutoConfiguration
@Configuration
@ImportResource("classpath:spring-context.xml")
@SpringBootApplication
public class MqspringApplication implements CommandLineRunner {

    @Autowired 
    private Pojo pojo;

	public static void main(String[] args) {
		SpringApplication.run(MqspringApplication.class, args);
	}

}
