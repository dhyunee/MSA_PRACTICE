package com.example.msa_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaServerApplication.class, args);
	}

}
