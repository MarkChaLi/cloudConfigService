package com.zjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer  //注入eureka服务
public class CloudConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServiceApplication.class, args);
	}
}
