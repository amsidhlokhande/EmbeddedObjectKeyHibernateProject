/**
 * 
 */
package com.amsidh.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.amsidh.mvc.dtos.Address;
import com.amsidh.mvc.dtos.UserDetails;



/**
 * @author VIRU
 *
 */
public class HibernateUtil {
	
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetails user=new UserDetails(new Integer(10851649), "amsidh.lokhande", "amsidh.lokhande@accenture.com", new Address("Hinjewadi","Pune","Maharashtra",new Long(411057)));
		
		Address homeAddress=new Address("Vinayak Nagar","Pune","Maharashtra",new Long(411061));
		user.setHomeAddress(homeAddress);
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
		user=null;
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		user=(UserDetails)session.get(UserDetails.class, new Integer(1));
		System.out.println("User Name: "+user.getUserName()+"  City: "+user.getHomeAddress().getCity());
	}

}
