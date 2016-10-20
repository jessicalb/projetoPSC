/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exceção.DAOException;
import model.Produto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class ProdutoDAO extends DAOGenerico<Produto> {

    
  
    
    public ProdutoDAO(EntityManager manager){
       super();
        
    }
    
  
    public List<Produto> listar() throws DAOException {
         try{
        
        EntityTransaction  tx = getEntityManager().getTransaction();
        Query consulta = getEntityManager().createQuery("Select p from Produto p");
        List<Produto> produtos = consulta.getResultList();
       
        return produtos;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os produtos.", e);
        
        }
    }
        
         public Produto consultarPorId(Produto p, Serializable id) {
               p = null;
		try {
			p = getEntityManager().find(Produto.class, id);
                        
		}catch (RuntimeException re){

			re.printStackTrace();
                }
                return p;
    }
    
    
    
    
}
