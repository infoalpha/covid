package com.federal.cdc.service;


import com.federal.cdc.dao.FacilityDao;
import com.federal.cdc.model.Facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacilityServiceImpl implements FacilityService {

	
	@Autowired
	FacilityDao facilityDAO;
	
	@Override
	public int register(Facility facility) {
		return facilityDAO.register(facility);
	}
	

	@Override
	public List<Facility> getAllFacilities() {
		return facilityDAO.getAllFacilities();
	}


	@Override
	public int update(Facility facility) {
		// TODO Auto-generated method stub
		return facilityDAO.update(facility);
	}


	@Override
	public Facility getFacilityById(int id) {
		// TODO Auto-generated method stub
		return facilityDAO.getFacilityById(id);
	}



}
