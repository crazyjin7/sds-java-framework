package ch07.member;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MemberDAO {

	private static final SessionFactory sessionFactory;

	static {
		sessionFactory = new Configuration().configure("ch07/member/hibernate.cfg.xml").buildSessionFactory();
	}

	public void insertMember(Member member) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(member);

		session.getTransaction().commit();
		session.close();
	}
}
