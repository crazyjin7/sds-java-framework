package common.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

	/**
	 * 세션을 관리하는 팩토리
	 */
	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * 현재 사용중인 세션객체를 가져옴
	 * @return
	 */
	public static Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public static void closeSession() {
		sessionFactory.getCurrentSession().close();
	}

	public static Transaction beginTransaction() {
		return sessionFactory.getCurrentSession().beginTransaction();
	}

	public static void commitTransaction() {
		sessionFactory.getCurrentSession().getTransaction().commit();
	}

	public static void rollbackTransaction() {
		if (sessionFactory.getCurrentSession().isOpen()) {
			Transaction tx = sessionFactory.getCurrentSession().getTransaction();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		}
	}

}















