package com.pensionmgmt.pensionerdetail.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pensionmgmt.pensionerdetail.Services.PensionerDetailsServiceImpl;
import com.pensionmgmt.pensionerdetail.entity.PensionerDetail;

@RestController
@RequestMapping("/api/v1")
public class PensionerDetailController {

	@Autowired
	PensionerDetailsServiceImpl detailsServiceImpl;
	
	@PostMapping("/PensionerDetail")
	public long createUser( @RequestBody  PensionerDetail detail) throws Exception {
		detailsServiceImpl.saveUser(detail);
		System.out.println(detail.getName());
		return detail.getAadharNumber();
	}
	
	@GetMapping("/PensionerDetailByAdhaar/{adharNumber}")
	public PensionerDetail getPensionerDetailByAdhaar(@PathVariable long adharNumber) {
		return detailsServiceImpl.getPensionerDetailsByAdhaarCard(adharNumber);
		
	}
	
	@GetMapping("/getAllPensioner")
	public List<PensionerDetail> getAllPensioner( ) {
		return detailsServiceImpl.getAllPensioner();
		
	}
}
