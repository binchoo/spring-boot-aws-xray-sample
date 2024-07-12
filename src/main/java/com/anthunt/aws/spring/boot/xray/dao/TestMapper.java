package com.anthunt.aws.spring.boot.xray.dao;

import org.apache.ibatis.annotations.Mapper;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@Mapper
public interface TestMapper {

	public int count(int idx);
	
}
