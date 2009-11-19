package ch08.collection.list;

import org.hibernate.Session;

import common.util.HibernateUtil;

public class FamilyTest {

	public static void main(String[] args) {
		HibernateUtil.beginTransaction();

		Session session = HibernateUtil.getCurrentSession();

		Parent parent1 = new Parent("°©");
		Parent parent2 = new Parent("À»");
		Parent parent3 = new Parent("º´");

		Child child1 = new Child("A");
		Child child2 = new Child("B");
		Child child3 = new Child("C");

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
