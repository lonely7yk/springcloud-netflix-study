package com.lonely7yk.springcloud.service;

import com.lonely7yk.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
	boolean addDept(Dept dept);

	Dept queryById(Long id);

	List<Dept> queryAll();
}
