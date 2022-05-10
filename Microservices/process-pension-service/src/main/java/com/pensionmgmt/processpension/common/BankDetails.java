package com.pensionmgmt.processpension.common;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {


	private String accountNumber;
	private String bankName;
	@Enumerated(EnumType.STRING)
	private BankType bankType;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public BankType getBankType() {
		return bankType;
	}

	public void setBankType(BankType bankType) {
		this.bankType = bankType;
	}

}
