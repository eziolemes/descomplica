package br.com.descompila.model.dao;

import javax.persistence.EntityManager;

import br.com.descompila.connection.ConnectionFactory;
import br.com.descompila.model.bean.Categoria;

/**
 * 
 * @author Ezio Lemes
 *
 */

public class CategoriaDao {

	public Categoria save(Categoria categoria) {
		
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			
			if(categoria.getId() == null) {
				em.persist(categoria);
			}else {
				em.merge(categoria);
			}
			
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		return categoria;
	}
	
	public Categoria findById(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Categoria categoria = null;
		
		try {
			categoria = em.find(Categoria.class, id);
			
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return categoria;
	}
	
	
}
