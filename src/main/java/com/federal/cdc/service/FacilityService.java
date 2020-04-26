package com.federal.cdc.service;

import com.federal.cdc.model.Facility;
import com.federal.cdc.model.User;

import java.util.List;


public interface FacilityService 
{
	int register(Facility facility);
    List<Facility> getAllFacilities();
    int update(Facility facility);
    Facility getFacilityById(int id);
}
