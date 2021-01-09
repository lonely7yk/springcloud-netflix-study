package com.lonely7yk.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRule {
	@Bean
	public IRule myRule() {
		return new MyRandomRule();  // 默认是轮询，我们现在定义为 MyRandomRule
	}
}
