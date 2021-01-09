package com.lonely7yk.springcloud.controller;

import com.lonely7yk.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

	// private static final String REST_URL_PREFIX = "http://localhost:8001";
	// Ribbon -- 我们这里的地址是一个变量，通过服务名来访问
	private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

	// 理解：消费者，不应该有 Service 层
	// RestTemplate ... 供我们直接调用。注册到 Spring 中
	// (url, Class<T> responseType, 实体: Map)
	@Autowired
	private RestTemplate restTemplate;      // 提供多种便捷访问远程http服务的方法，简单的restful服务模板

	@RequestMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}

	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping("/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}
}
