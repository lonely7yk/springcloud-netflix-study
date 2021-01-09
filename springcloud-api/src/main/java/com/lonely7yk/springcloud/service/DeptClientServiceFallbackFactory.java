package com.lonely7yk.springcloud.service;

import com.lonely7yk.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public Dept queryById(Long id) {
				return new Dept()
						.setDeptno(id)
						.setDname("服务已降级，无法查询")
						.setDb_source("服务已降级，无法查询");
			}

			@Override
			public List<Dept> queryAll() {
				return null;
			}

			@Override
			public boolean addDept(Dept dept) {
				return false;
			}
		};
	}
}
