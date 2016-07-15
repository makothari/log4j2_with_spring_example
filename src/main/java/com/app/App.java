package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		SpringApplication.run(App.class, args);

		logger.debug("Application Sarted");
		logger.trace("Application Sarted");
		logger.debug("Application Sarted");
		logger.info("Application Sarted");
		logger.warn("Application Sarted");
		logger.error("Application Sarted");

	}


}
