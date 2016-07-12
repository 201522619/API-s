package br.com.bara.web_service.infraestrutura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProducer {
	
	private EntityManagerFactory factory;
	
	public EntityManagerProducer() {
		this.factory = Persistence.createEntityManagerFactory("web_service");
	}
	
	public EntityManager createEntityManager() {
		return this.factory.createEntityManager();
	}
	
}

