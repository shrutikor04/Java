package com.eb.hql.main;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.eb.hql.entity.Student;




public class InsertData {
	public static void main(String[] args)  {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
	Student student = new Student();
	student.setId(102);
	student.setName("Archana");
	student.setRoll("110");
	student.setPhone("7856235689");
	student.setDegree("BCA");
	
	Student student1 = new Student();
	student1.setId(103);
	student1.setName("Shruti");
	student1.setRoll("111");
	student1.setPhone("7856235699");
	student1.setDegree("BSC");

	
	session.save(student);
	
	tx.commit();
	session.close();
}
}
