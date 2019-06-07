package br.com.descompila.tests;

import br.com.descompila.model.bean.Categoria;
import br.com.descompila.model.dao.CategoriaDao;

public class CategoriaTest {

	public static void main(String[] args) {

		/*Categoria c = new Categoria();
		c.setDescricao("Bebidas 3");
		c.setId(5);
		
		CategoriaDao dao = new CategoriaDao();
		c = dao.save(c);
		
		System.out.println("ID: " + c.getId());
		System.out.println("Descrição: " + c.getDescricao());*/
		
		CategoriaDao dao = new CategoriaDao();
		
		Categoria categoria = dao.findById(2);
		
		System.out.println("Descrição: " + categoria.getDescricao());
	}
}
