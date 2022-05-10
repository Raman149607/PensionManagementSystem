package com.pensionmgmt.pensionerdetail.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pensionmgmt.pensionerdetail.entity.PensionerDetail;

@Repository
public interface PensionerDetailRepository extends JpaRepository<PensionerDetail,Long>{

}
