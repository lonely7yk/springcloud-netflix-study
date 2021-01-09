package com.lonely7yk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard // 开启 Hystrix 的 dashboard
public class DeptConsumerDashboard_9001 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerDashboard_9001.class, args);
	}
}
