package com.cnsi.Apps.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnsi.Apps.Repository.AppDetailsRepository;
import com.cnsi.Apps.model.AppDetails;

@RestController
@CrossOrigin
public class AppController {

	
	@Autowired
	AppDetailsRepository AppDetails ;

	@RequestMapping("/viewApps")
	public List<AppDetails> viewApps(){
		return AppDetails.findAll();
	}
	
	
	@RequestMapping("/addApp")
	public String addApps(@RequestParam AppDetails addApp) {
		AppDetails updated =  AppDetails.save(addApp);
		return updated.getAppName();
		
	}
	@RequestMapping("/FindApp")
	public Optional<com.cnsi.Apps.model.AppDetails> FindApps( Integer Id) {
		Optional<com.cnsi.Apps.model.AppDetails> updated =  AppDetails.findById(Id);
			return updated;
		
	}
	
	
	
	
}
