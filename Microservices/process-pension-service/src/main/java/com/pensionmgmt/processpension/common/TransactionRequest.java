package com.pensionmgmt.processpension.common;


import com.pensionmgmt.processpension.entity.ProcessPensionInput;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {

	private PensionerDetail pensionerDetail;
	private ProcessPensionInput input;

	public PensionerDetail getPensionerDetail() {
		return pensionerDetail;
	}

	public void setPensionerDetail(PensionerDetail pensionerDetail) {
		this.pensionerDetail = pensionerDetail;
	}

	public ProcessPensionInput getInput() {
		return input;
	}

	public void setInput(ProcessPensionInput input) {
		this.input = input;
	}

}
