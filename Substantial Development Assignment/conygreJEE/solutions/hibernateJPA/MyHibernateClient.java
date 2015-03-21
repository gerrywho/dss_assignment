import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.Transaction;
import org.hibernate.Query;

import org.hibernate.MappingException;
import org.hibernate.HibernateException;


import org.hibernate.cfg.AnnotationConfiguration;

import com.conygre.cd.CompactDiscProduct;

public class MyHibernateClient
{
	public static void main(String[] args)
	{
		// Part 1 Creating a new object and new entry in the database


		// create an AnnotationConfiguration object
		AnnotationConfiguration cfg = new AnnotationConfiguration();

		try
		{
			// configure it to use the CompactDiscProduct class
			cfg.addAnnotatedClass(com.conygre.cd.CompactDiscProduct.class);
		}
		catch (MappingException e)
		{
			System.out.println("Mapping Exception " + e);
		}
		try
		{
			// create a SessionFactory
			SessionFactory factory = cfg.buildSessionFactory();

			// assign the Configuration to null. It's not needed now.
			cfg = null;

			// create a Session
			Session session = factory.openSession();

			//  create an instance of the CompactDiscProduct bean
			CompactDiscProduct product = new CompactDiscProduct("Bat out of Hell", 12.99, "MeatLoaf", 12, 22);

			// create transaction
			Transaction trans = session.beginTransaction();

			// save the CompactDiscProduct object
			session.save(product);

			// commit the transaction
			trans.commit();


			// Part 2 List all the data in the table

			Transaction tx = session.beginTransaction();


			Query query  = session.createQuery("from CompactDiscProduct");
			java.util.List cds = query.list();

			java.util.Iterator iter = cds.iterator();
			while (iter.hasNext() ) {
				CompactDiscProduct prod = (CompactDiscProduct) iter.next();
				System.out.println("CD: " + prod.getId() +
														": " + prod.getTitle() +
														" by " + prod.getArtist());
			}


		}
		catch (HibernateException e)
		{
			System.out.println("Hibernate exception " + e);
		}

	}


}

