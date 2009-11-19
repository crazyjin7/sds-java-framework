package ch08.product;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import common.util.HibernateUtil;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductName("장미 꽃바구니");
		p1.setDescription("장미 꽃바구니입니다.");

		Session session = HibernateUtil.getCurrentSession();
		HibernateUtil.beginTransaction();

		session.save(p1);
		System.out.println("1. save 완료......");

		Product p11 = (Product) session.get(Product.class, "1");
		System.out.println("2. get 완료......");
		//Product p11 = (Product) session.load(Product.class, "1");
		//System.out.println("2. load 완료......");
		System.out.println(p11.getProductId());

		System.out.println("getProductName 완료......");
		System.out.println(p11.getProductName());

		p11.setProductName("장미 꽃바구니(고급)");
		System.out.println("3. set 완료......");

		List productList = session.createQuery("from Product").list();
		Iterator it = productList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		p11.setDescription("장미 꽃바구니 고급입니다.");
		System.out.println("4. set 완료......");



		HibernateUtil.commitTransaction();
		HibernateUtil.closeSession();

	}

}
