package com.pensionmgmt.pensionerdetail.Services;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pensionmgmt.pensionerdetail.Repository.PensionerDetailRepository;
import com.pensionmgmt.pensionerdetail.entity.PensionerDetail;

@Service
public class PensionerDetailsServiceImpl implements PensionerDetailService{
	
	@Autowired
	PensionerDetailRepository detailRepository;

	@Override
	public PensionerDetail getPensionerDetailsByAdhaarCard(Long adharNumber) throws IllegalArgumentException{
		return detailRepository.findById(adharNumber).orElseThrow(()-> new IllegalArgumentException("Adhar Number Not found"));
	}
	
	public List<PensionerDetail> getAllPensioner(){
		return detailRepository.findAll();
	}
	
	@Transactional(rollbackOn = { Exception.class }, dontRollbackOn = { IllegalArgumentException.class,
			NullPointerException.class })
	public PensionerDetail saveUser(PensionerDetail pensionerDetail) throws Exception {
		System.out.println(pensionerDetail);
		detailRepository.save(pensionerDetail);
		return pensionerDetail;
	}

}
