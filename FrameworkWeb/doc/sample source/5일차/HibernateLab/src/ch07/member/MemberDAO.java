package ch07.member;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MemberDAO {
	
	private static final SessionFactory sessionFactory;
	
	static{
		sessionFactory 
			= new Configuration().configure("ch07/member/hibernate.cfg.xml").buildSessionFactory();
	}
	
	public void insertMember(Member member){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(member);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public Member getMember(long memberId){
		Session session = sessionFactory.openSession();

		Member member = (Member)session.get(Member.class, memberId);		
		session.close();
		return member;
	}
	
	public void updateMember(Member member){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.saveOrUpdate(member);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteMember(long memberId){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Member member = (Member)session.get(Member.class, memberId);
		session.delete(member);
		
		session.getTransaction().commit();
		session.close();
	}

}
















