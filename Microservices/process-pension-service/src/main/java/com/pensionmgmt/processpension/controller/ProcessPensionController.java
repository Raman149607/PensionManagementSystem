package com.pensionmgmt.processpension.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pensionmgmt.processpension.common.TransactionRequest;
import com.pensionmgmt.processpension.entity.PensionDetail;
import com.pensionmgmt.processpension.services.PensionProcessServiceImpl;

@RestController
@RequestMapping("/api/v1/ProcessPension")
public class ProcessPensionController {
	
	@Autowired
	PensionProcessServiceImpl impl;
	
	@PostMapping("/PensionDetail")
	public PensionDetail getPensionDetail(@RequestBody  TransactionRequest transactionRequest) throws Exception {
		return impl.CalculatePension(transactionRequest);
	
	}
	
	
	

}
