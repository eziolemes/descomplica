package br.com.descompila.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Ezio Lemes
 *
 */
public class ConnectionFactory {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
	
	public EntityManager getConnection() {
		return emf.createEntityManager();
	}
}