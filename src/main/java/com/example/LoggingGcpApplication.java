package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class LoggingGcpApplication {

	public static void main(String[] args) {
		log.error("some err");
		SpringApplication.run(LoggingGcpApplication.class, args);
	}

}
