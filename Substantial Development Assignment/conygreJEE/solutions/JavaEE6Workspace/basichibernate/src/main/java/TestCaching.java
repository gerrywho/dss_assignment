import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.ejb.HibernateEntityManager;
import org.hibernate.stat.Statistics;

import com.conygre.training.entities.CompactDisc;


public class TestCaching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// the cache is for the entity manager factory so this one factory will have a cache
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conygre");
	
		// nothing in the cache at this point so everything is coming from the db
		lookUpSomeStuff(factory);
		
		// when we look up this time, the cache will be populated so it will not hit the db
		// but the cache instead
		lookUpSomeStuff(factory);
		
	}
	
	public static void lookUpSomeStuff(EntityManagerFactory factory) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// get the Hibernate session object
		Session session = (Session) em.getDelegate();
		Statistics statistics= session.getSessionFactory().getStatistics();
		statistics.setStatisticsEnabled(true);
		
		
		// This example uses a Hibernate query object
//		Query q = session.createQuery("from CompactDisc").setCacheable(true);
//		
//		//Query allCDs= em.createQuery("from CompactDisc");
//		List<CompactDisc> cdsA = q.list();
//		
//		for (CompactDisc compactDisc : cdsA) {
//			System.out.println(compactDisc.getArtist());
//		}
//		
//		CompactDisc cd = em.find(CompactDisc.class, 16);
//		System.out.println(cd.getTitle());
//		
//		CompactDisc cd2 = em.find(CompactDisc.class, 16);
//		System.out.println(cd.getTitle());
		
		// Now use the named query
		javax.persistence.Query q1 = em.createNamedQuery("compactdisc.getAll");
		q1.setParameter("price", 4.0);
		
		List<CompactDisc> namedQueryResults = q1.getResultList();
		
		for (CompactDisc compactDisc : namedQueryResults) {
			System.out.println(compactDisc.getTitle() + " is " + compactDisc.getPrice());
		}
		
		tx.commit();
		em.close();
		
		
		System.out.println("There were "+ statistics.getSecondLevelCacheHitCount() +
				" hits on the cache and "+ statistics.getSecondLevelCacheMissCount() + " misses");
		
	}
	

}
