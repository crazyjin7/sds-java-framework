package ch09.hql;

import org.hibernate.Session;

import common.util.HibernateUtil;

public class FamilyTest {

	public static void main(String[] args) {
		HibernateUtil.beginTransaction();

		Session session = HibernateUtil.getCurrentSession();

		Parent parent1 = new Parent("ȫ�浿", "����");
		Parent parent2 = new Parent("�̼���", "�屺");
		Parent parent3 = new Parent("�Ӳ���", "����");

		Child child1 = new Child("ȫ����", 29);
		Child child2 = new Child("�̹���", 50);
		Child child3 = new Child("ȫ����", 25);

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
