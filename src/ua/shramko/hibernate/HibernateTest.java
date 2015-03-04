package ua.shramko.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Users user = new Users();
		user.setName("Alex");
		user.setLastName("Shramko");
		user.setDate_Birth(new Date(82,3,25));
		
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		           config.getProperties()).build();
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}

}
