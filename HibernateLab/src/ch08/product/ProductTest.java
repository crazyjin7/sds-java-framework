package ch08.product;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import common.util.HibernateUtil;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductName("��� �ɹٱ���");
		p1.setDescription("��� �ɹٱ����Դϴ�.");

		Session session = HibernateUtil.getCurrentSession();
		HibernateUtil.beginTransaction();

		session.save(p1);
		System.out.println("1. save �Ϸ�......");

		Product p11 = (Product) session.get(Product.class, "1");
		System.out.println("2. get �Ϸ�......");
		//Product p11 = (Product) session.load(Product.class, "1");
		//System.out.println("2. load �Ϸ�......");
		System.out.println(p11.getProductId());

		System.out.println("getProductName �Ϸ�......");
		System.out.println(p11.getProductName());

		p11.setProductName("��� �ɹٱ���(���)");
		System.out.println("3. set �Ϸ�......");

		List productList = session.createQuery("from Product").list();
		Iterator it = productList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		p11.setDescription("��� �ɹٱ��� ����Դϴ�.");
		System.out.println("4. set �Ϸ�......");



		HibernateUtil.commitTransaction();
		HibernateUtil.closeSession();

	}

}
