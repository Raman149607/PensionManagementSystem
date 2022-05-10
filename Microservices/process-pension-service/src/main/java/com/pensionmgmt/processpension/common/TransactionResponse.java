package com.pensionmgmt.processpension.common;

import com.pensionmgmt.processpension.entity.PensionDetail;
import com.pensionmgmt.processpension.entity.ProcessPensionInput;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

	private ProcessPensionInput input;
	private PensionDetail pensionDetail;
	private PensionerDetail pensionerDetail;

	public ProcessPensionInput getInput() {
		return input;
	}

	public void setInput(ProcessPensionInput input) {
		this.input = input;
	}

	public PensionDetail getPensionDetail() {
		return pensionDetail;
	}

	public void setPensionDetail(PensionDetail pensionDetail) {
		this.pensionDetail = pensionDetail;
	}

	public PensionerDetail getPensionerDetail() {
		return pensionerDetail;
	}

	public void setPensionerDetail(PensionerDetail pensionerDetail) {
		this.pensionerDetail = pensionerDetail;
	}

}
