package com.cjc.app.tl.ledger.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class LedgerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LedgerMicroserviceApplication.class, args);
	}

	@Bean
	RestTemplate rt()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}
}
