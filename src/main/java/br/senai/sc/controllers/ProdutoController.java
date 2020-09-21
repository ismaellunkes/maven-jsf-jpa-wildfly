package br.senai.sc.controllers;

import java.util.List;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.senai.sc.daos.ProdutoDAO;
import br.senai.sc.models.Produto;

@Named
@ViewScoped
@Default @Any
public class ProdutoController {

	    @Inject
	    private ProdutoDAO dao;
	    
	    Produto produto = new Produto();;

	    public ProdutoController() {
	    	 
	    }

	    public List<Produto> getProdutos() {
	        List<Produto> result = dao.listAll();
	        return result;
	    }
	    
	    public void save (Produto p) {
	    	dao.insert(p);
	    }	    
	    
	}


