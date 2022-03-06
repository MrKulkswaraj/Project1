package dao;


import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Product_Info;

public class Product_Dao {
	public int checkDetails(Product_Info pi) {
	try {
		Configuration con= new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(pi);
		tran.commit();
		session.close();
		}catch (Exception e) {
			System.out.println(e);
			
		}
	return 1;
	
	}
	
	
}
 
