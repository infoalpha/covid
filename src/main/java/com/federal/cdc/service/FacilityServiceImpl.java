package com.federal.cdc.service;


import com.federal.cdc.dao.FacilityDAO;
import com.federal.cdc.model.FacilityVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacilityServiceImpl implements FacilityService {

	
	@Autowired
	FacilityDAO facilityDAO;
	

	@Override
	public List<FacilityVO> getAllFacilities() {
		return facilityDAO.getAllFacilities();
	}
}
