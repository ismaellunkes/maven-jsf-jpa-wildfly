package br.senai.sc.daos;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.senai.sc.models.Produto;

@Stateless
public class ProdutoDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "prova-java")
    private EntityManager entityManager;   
     
    
    @SuppressWarnings("unchecked")
	public List<Produto> listAll(){
    	return entityManager.createQuery("SELECT p FROM Producto p").getResultList();
    }
	
	public void insert (Produto produto) {
		entityManager.persist(produto);
	}
	
}
