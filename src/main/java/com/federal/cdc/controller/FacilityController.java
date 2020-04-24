package com.federal.cdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.federal.cdc.model.FacilityVO;
import com.federal.cdc.service.FacilityService;


@Controller
@RequestMapping("/facility")
public class FacilityController 
{
	@Autowired
	FacilityService facilityService;

	@RequestMapping(value = "/getAllFacilities", method = RequestMethod.GET)
	public String getAllFacilities(Model model)
	{
		
		List<FacilityVO> facilitiesList = facilityService.getAllFacilities();
		
		model.addAttribute("facilities", facilitiesList);
		return "facilitiesListDisplay";
	}
}