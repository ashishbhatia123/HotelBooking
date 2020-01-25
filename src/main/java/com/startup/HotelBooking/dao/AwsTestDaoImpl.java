package com.startup.HotelBooking.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.startup.HotelBooking.bean.AwsTestBean;

@Repository
@Transactional
public class AwsTestDaoImpl implements IAwsTestDaoImpl {

	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public AwsTestBean showAwsTest() {
		// TODO Auto-generated method stub
		TypedQuery<AwsTestBean> query  =  entitymanager.createQuery("select awsTestBean from AwsTestBean awsTestBean ", AwsTestBean.class);
		AwsTestBean awsTestBean=query.getSingleResult();
		System.out.println("Hello");
		System.out.println("ashish");
		return awsTestBean;
	}

	@Override
	public boolean AddAwsTest(AwsTestBean awsTestbean) {
		// TODO Auto-generated method stub
		 entitymanager.persist(awsTestbean);
		 return true;
	}

	
}
