package br.senai.sc.services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.senai.sc.daos.ProdutoDAO;
import br.senai.sc.models.Produto;

@Stateless
@Path("produto")
public class ProdutoResource implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
    private ProdutoDAO dao;

    @GET
    @Produces("application/json")
    public List<Produto> findAll() {
        return dao.listAll();
    }
    
    @POST    
    public void save(Produto p) {
        dao.insert(p);;
    }
        
}