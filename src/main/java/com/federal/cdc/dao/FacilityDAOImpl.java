package com.federal.cdc.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.federal.cdc.model.FacilityVO;

import org.springframework.stereotype.Repository;


@Repository
public class FacilityDAOImpl implements FacilityDAO {

	
	public List<FacilityVO> getAllFacilities()
	{
		List<FacilityVO> facilities = new ArrayList<FacilityVO>();
		
		FacilityVO vo1 = new FacilityVO();
		
		vo1.setId(1);
		vo1.setName("New york City Hospital");
		vo1.setCompanyName("NewYork Inc");
		vo1.setAddress("1st Street Newyork");
		vo1.setBedCapacity(1000);
		
		vo1.setInspectionDate(new Date().toString());
		vo1.setStatus("APPROVED");
		facilities.add(vo1);
		
		FacilityVO vo2 = new FacilityVO();
		vo2.setId(2);
		vo2.setName("NewJersey County Hospital");
		vo2.setCompanyName("NewJersey County Inc");
		vo2.setAddress("999st Street NewJersey");
		vo2.setBedCapacity(40);
		vo2.setInspectionDate(new Date().toString());
		vo2.setStatus("DECLINED");
		facilities.add(vo2);
	
		
		
		return facilities;
	}
}