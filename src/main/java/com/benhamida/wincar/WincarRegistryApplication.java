package com.benhamida.wincar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WincarRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WincarRegistryApplication.class, args);
	}

}
