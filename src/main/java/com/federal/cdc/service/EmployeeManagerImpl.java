package com.federal.cdc.service;


import com.federal.cdc.dao.EmployeeDAO;
import com.federal.cdc.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees()
	{
		return dao.getAllEmployees();
	}
}
