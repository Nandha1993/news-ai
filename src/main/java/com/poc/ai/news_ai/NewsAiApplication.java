package com.poc.ai.news_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "com.poc.ai.news_ai")
public class NewsAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsAiApplication.class, args);
	}

}
