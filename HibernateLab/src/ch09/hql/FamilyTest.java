package ch09.hql;

import org.hibernate.Session;

import common.util.HibernateUtil;

public class FamilyTest {

	public static void main(String[] args) {
		HibernateUtil.beginTransaction();

		Session session = HibernateUtil.getCurrentSession();

		Parent parent1 = new Parent("홍길동", "의적");
		Parent parent2 = new Parent("이순신", "장군");
		Parent parent3 = new Parent("임꺽정", "산적");

		Child child1 = new Child("홍도야", 29);
		Child child2 = new Child("이미자", 50);
		Child child3 = new Child("홍일점", 25);

		parent1.getChildren().add(child1);
		parent1.getChildren().add(child3);
		parent2.getChildren().add(child2);
		child1.setP(parent1);
		child2.setP(parent2);
		child3.setP(parent1);

		session.save(parent1);
		session.save(parent2);
		session.save(parent3);

		HibernateUtil.commitTransaction();
		HibernateUtil.closeSession();
	}
}
