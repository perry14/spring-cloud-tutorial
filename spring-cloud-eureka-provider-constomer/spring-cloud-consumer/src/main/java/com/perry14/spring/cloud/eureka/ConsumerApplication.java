package com.perry14.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.perry14.spring.cloud.eureka.remote")
public class ConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
