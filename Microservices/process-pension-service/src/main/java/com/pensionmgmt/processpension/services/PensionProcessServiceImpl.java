package com.pensionmgmt.processpension.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pensionmgmt.processpension.common.PensionerDetail;
import com.pensionmgmt.processpension.common.TransactionRequest;
import com.pensionmgmt.processpension.common.TransactionResponse;
import com.pensionmgmt.processpension.entity.PensionDetail;
import com.pensionmgmt.processpension.entity.ProcessPensionInput;

@Service
public class PensionProcessServiceImpl implements PensionProcessServices {

	
	@Autowired
	private RestTemplate template;
	

	public PensionDetail CalculatePension(TransactionRequest transactionRequest) throws Exception {
		
		ProcessPensionInput processPensionInput =transactionRequest.getInput();
		PensionerDetail pensionerDetail = transactionRequest.getPensionerDetail();
		pensionerDetail.setAadharNumber(processPensionInput.getAdharNumber());
		
		template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment,
//				Payment.class);
		
		if(transactionRequest.getAadharNumber() == pensionerDetail.getAadharNumber())
		{
			
			double salary = pensionerDetail.getSalaryEarned();
			double allowances = pensionerDetail.getAllowances();
			double pensionAmount = 0;
			if(transactionRequest.getPensionType().equals("SELF"))
			{
				pensionAmount = 0.8*salary + allowances;
			}
			else if(transactionRequest.getPensionType().equals("FAMILY"))
			{
				pensionAmount = 0.5 * salary + allowances;
			}
			
			PensionDetail pensionDetail = new PensionDetail();
			
			pensionDetail.setPensionAmount(pensionAmount);
			pensionDetail.getBankServiceCharge();
			
			return pensionDetail;
		}
		else
		{
			throw new IllegalArgumentException("Invalid pensioner detail provided, please provide valid detail.");
		}










	}

}
