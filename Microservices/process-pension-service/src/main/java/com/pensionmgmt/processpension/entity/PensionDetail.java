package com.pensionmgmt.processpension.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PensionDetail {

	private double pensionAmount;

	private double bankServiceCharge;

	private ProcessPensionInput pensionInput;

	public double getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public double getBankServiceCharge() {
		return bankServiceCharge;
	}

	public void setBankServiceCharge(double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

	public ProcessPensionInput getPensionInput() {
		return pensionInput;
	}

	public void setPensionInput(ProcessPensionInput pensionInput) {
		this.pensionInput = pensionInput;
	}

	
}
