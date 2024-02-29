package revision;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Demo {
	public static void main(String[] args) {
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources ms=new MetadataSources(registry);
		Metadata md = ms.getMetadataBuilder().build();
		SessionFactory sf = md.getSessionFactoryBuilder().build();
		Session session = sf.openSession();
		
		Demoo d=new Demoo();
		
		d.setName("ram");
		
		session.save(d);
		session.beginTransaction().commit();
		session.close();
		sf.close();
	}

}
