package com.hsbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hsbc.domain.Employee;

public class EmployeInsertion {
public static void main(String[] args) {
	
	Configuration configuration=new Configuration().configure("com/hsbc/conf/hibernate.cfg.xml");
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	Employee employee=new Employee();
	employee.setEmployee_id(2);
	employee.setFirstname("Pooja ");
	employee.setLastname("Ahuja ");
	session.save(employee);
	transaction.commit();
	
	
	

}
}
