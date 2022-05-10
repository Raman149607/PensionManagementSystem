package com.pensionmgmt.processpension.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProcessPensionInput {

	private long adharNumber;

	public ProcessPensionInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

}
