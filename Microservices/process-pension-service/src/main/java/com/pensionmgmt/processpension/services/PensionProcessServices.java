package com.pensionmgmt.processpension.services;

import com.pensionmgmt.processpension.common.TransactionRequest;
import com.pensionmgmt.processpension.common.TransactionResponse;
import com.pensionmgmt.processpension.entity.PensionDetail;

public interface PensionProcessServices {
	

	public PensionDetail CalculatePension(TransactionRequest transactionRequest) throws Exception;
		
	

}
