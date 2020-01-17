package com.saturnmob.webhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.saturnmob.controller.WebHookController;

@SpringBootApplication
@ComponentScan(basePackageClasses = WebHookController.class)
public class WebHookApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebHookApplication.class, args);
	}

}
