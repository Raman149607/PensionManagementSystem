package com.pensionmgmt.pensionerdetail.Services;

import com.pensionmgmt.pensionerdetail.entity.PensionerDetail;

public interface PensionerDetailService {
	
	public PensionerDetail getPensionerDetailsByAdhaarCard(Long adharNumber);

}
