package com.lonely7yk.springcloud;

import com.lonely7yk.myrule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

// Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心 ip 地址和端口号
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = CustomRule.class)
public class DeptConsumer_80 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_80.class, args);
	}
}
