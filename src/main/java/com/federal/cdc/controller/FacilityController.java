package com.federal.cdc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.federal.cdc.model.Facility;
import com.federal.cdc.service.FacilityService;

@Controller
@RequestMapping("/facility")
public class FacilityController {
	@Autowired
	FacilityService facilityService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("facilityRegister");
		mav.addObject("facility", new Facility());

		return mav;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("facility") Facility facility) {

		int facilityId = facilityService.register(facility);
		List<Facility> facilitiesList = facilityService.getAllFacilities();

		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("facilityId", facilityId);
		mav.addObject("facilities", facilitiesList);

		return mav;
	}

	@RequestMapping(value = "/getAllFacilities", method = RequestMethod.GET)
	public ModelAndView getAllFacilities(Model model) {

		List<Facility> facilitiesList = facilityService.getAllFacilities();
		return new ModelAndView("welcome", "facilities", facilitiesList);
	}
	
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response,@PathVariable int id) {
		
		
		Facility facility = facilityService.getFacilityById(id);
		ModelAndView mav = new ModelAndView("editfacility");
		mav.addObject("facility", facility);

		return mav;
	}
	
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public ModelAndView editSave(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("facility") Facility facility) {
		
		int facilityId = facilityService.update(facility);

		List<Facility> facilitiesList = facilityService.getAllFacilities();
		return new ModelAndView("welcome", "facilities", facilitiesList);
	}
}