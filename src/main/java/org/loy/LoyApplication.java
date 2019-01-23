package org.loy;


import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LoyApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoyApplication.class, args);
		log.info("===============LoyApplication run success===============");
	}
}
