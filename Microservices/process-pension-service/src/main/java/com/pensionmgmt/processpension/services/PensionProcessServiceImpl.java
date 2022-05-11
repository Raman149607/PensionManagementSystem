package com.pensionmgmt.processpension.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pensionmgmt.processpension.common.PensionerDetail;
import com.pensionmgmt.processpension.common.TransactionRequest;
import com.pensionmgmt.processpension.entity.PensionDetail;

@Service
public class PensionProcessServiceImpl implements PensionProcessServices {

	
	@Autowired
	private RestTemplate template;
	

	public PensionDetail CalculatePension(TransactionRequest transactionRequest) throws Exception {
		
		
		PensionerDetail pensionerDetail2 = this.template.getForObject("http://PENSIONER-SERVICE/api/v1/Pensioner/PensionerDetailByAdhaar/{adharNumber}",PensionerDetail.class);
		
		if(transactionRequest.getAadharNumber()== pensionerDetail2.getAadharNumber())
		{
			
			double salary = pensionerDetail2.getSalaryEarned();
			double allowances = pensionerDetail2.getAllowances();
			double pensionAmount = 0;
			if(transactionRequest.getPensionType().equals("SELF"))
			{
				pensionAmount = 0.8*salary + allowances;
			}
			else if(transactionRequest.getPensionType().equals("FAMILY"))
			{
				pensionAmount = 0.5 * salary + allowances;
			}
			
			
			double serviceCharge = 500;
			PensionDetail pensionDetail = new PensionDetail();
			
			pensionDetail.setPensionAmount(pensionAmount);
			
			pensionDetail.setBankServiceCharge(serviceCharge);
			
			return pensionDetail;
					
		}
		else
		{
			throw new IllegalArgumentException("Invalid pensioner detail provided, please provide valid detail.");
		}




	}

}
