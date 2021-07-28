package com.cjc.app.tl.disbursement.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class DisbursementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisbursementApplication.class, args);
	}

	@Bean
	RestTemplate rt()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}
}
