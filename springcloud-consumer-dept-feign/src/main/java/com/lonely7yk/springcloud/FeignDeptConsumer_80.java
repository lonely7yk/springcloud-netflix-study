package com.lonely7yk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心 ip 地址和端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lonely7yk.springcloud")
public class FeignDeptConsumer_80 {
	public static void main(String[] args) {
		SpringApplication.run(FeignDeptConsumer_80.class, args);
	}
}
