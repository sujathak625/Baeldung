package com.example.demo;

import java.awt.Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringWebFluxBaeldungApplication {

	Logger logger = LoggerFactory.getLogger(SpringWebFluxBaeldungApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringWebFluxBaeldungApplication.class, args);

	}

}
