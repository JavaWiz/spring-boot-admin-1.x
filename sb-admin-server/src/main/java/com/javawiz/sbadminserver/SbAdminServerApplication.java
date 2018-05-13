package com.javawiz.sbadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SbAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAdminServerApplication.class, args);
	}
}
