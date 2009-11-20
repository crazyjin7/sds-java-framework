package ch09.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import common.util.HibernateUtil;

public class FamilyTest {

	public static void init() {
		Session session = HibernateUtil.getCurrentSession();

		Parent parent1 = new Parent("È«±æµ¿", "ÀÇÀû");
		Parent parent2 = new Parent("ÀÌ¼ø½Å", "Àå±º");
		Parent parent3 = new Parent("ÀÓ²©Á¤", "»êÀû");

		Child child1 = new Child("È«µµ¾ß", 29);
		Child child2 = new Child("ÀÌ¹ÌÀÚ", 50);
		Child child3 = new Child("È«ÀÏÁ¡", 25);

		parent1.getChildren().add(child1);
		parent1.getChildren().add(child3);
		parent2.getChildren().add(child2);
		child1.setP(parent1);
		child2.setP(parent2);
		child3.setP(parent1);

		session.save(parent1);
		session.save(parent2);
		session.save(parent3);
	}

	public static void runHql(String hql) {
		Session session = HibernateUtil.getCurrentSession();
		List list = session.createQuery(hql).list();

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void runHql2(String hql, String name) {
		Session session = HibernateUtil.getCurrentSession();
		Query query = session.createQuery(hql);

		//query.setString(0, name);
		query.setString("name", name);

		List list = query.list();

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		HibernateUtil.beginTransaction();

		Session session = HibernateUtil.getCurrentSession();

		init();

		//runHql("from Parent p where p.name='È«±æµ¿'");
		//runHql2("from Parent p where p.name=?", "È«±æµ¿");
		runHql2("from Parent p where p.name=:name", "È«±æµ¿");

		HibernateUtil.commitTransaction();
		HibernateUtil.closeSession();
	}
}
