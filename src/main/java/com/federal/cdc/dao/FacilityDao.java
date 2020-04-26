package com.federal.cdc.dao;


import com.federal.cdc.model.Facility;

import java.util.List;


public interface FacilityDao 
{
	int register(Facility facility);
	public List<Facility> getAllFacilities();
	int update(Facility facility);
	Facility getFacilityById(int id);

}