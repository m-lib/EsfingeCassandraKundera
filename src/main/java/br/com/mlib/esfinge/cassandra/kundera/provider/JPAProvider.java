package br.com.mlib.esfinge.cassandra.kundera.provider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.esfinge.querybuilder.jpa1.EntityManagerProvider;

public class JPAProvider implements EntityManagerProvider {

	@Override
    public EntityManager getEntityManager() {
		EntityManagerFactory factory = this.getEntityManagerFactory();
		EntityManager manager = factory.createEntityManager();
        return manager;
    }

    @Override
    public EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("sample");
    }

}
