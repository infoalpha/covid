package com.federal.cdc.dao;

import com.federal.cdc.model.EmployeeVO;

import java.util.List;


public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}