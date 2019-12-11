package com.sananda.hibernatemapping;

import java.util.Date;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

import com.sananda.hibernatemapping.Entity.EmpAddress;
import com.sananda.hibernatemapping.Entity.EmpDetails;
import com.sananda.hibernatemapping.Util.*;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class HibernatemappingApplication{

	public static void main(String[] args) {
		SpringApplication.run(HibernatemappingApplication.class, args);
		Session session=HibrnateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		EmpDetails emp = new EmpDetails();
		emp.setEmpName("Rick J");
		emp.setJoiningDate(new Date());
		EmpAddress addr1 = new EmpAddress();
		addr1.setStreet("12A Baker Street");
		addr1.setCity("London");
		addr1.setEmp(emp);
		emp.getEmpAddress().add(addr1);
		
		
		
		EmpAddress addr2 = new EmpAddress();
		addr2.setStreet("J K Street");
		addr2.setCity("Mumbai");
		addr2.setEmp(emp);
		emp.getEmpAddress().add(addr2);
		
		
		
		session.save(addr1);
		session.save(addr2);
		
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("emp record saved");
		session.close();
	}
  
}
