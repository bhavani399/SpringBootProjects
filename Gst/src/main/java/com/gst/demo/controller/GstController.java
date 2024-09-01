package com.gst.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gst.demo.repo.GstRepo;

@RestController
public class GstController {
	@Autowired
	GstRepo gstRepo;
	
	@GetMapping(value ="/percentage/{hsn}")
	public int getPercentage(@PathVariable int hsn) {
		return gstRepo.getPercentage(hsn);
	}

}
