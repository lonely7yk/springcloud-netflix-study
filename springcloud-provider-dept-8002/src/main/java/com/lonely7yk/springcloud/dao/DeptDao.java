package com.lonely7yk.springcloud.dao;

import com.lonely7yk.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
	boolean addDept(Dept dept);

	Dept queryById(Long id);

	List<Dept> queryAll();
}
