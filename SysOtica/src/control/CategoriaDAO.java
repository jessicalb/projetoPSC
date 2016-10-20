/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.DAOGenerico;
import Exceção.DAOException;
import model.Categoria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class CategoriaDAO extends DAOGenerico<Categoria> {

   
    
    public CategoriaDAO(EntityManager manager){
        super();
        
        }
    
  
    public List<Categoria> listar() throws DAOException {
         try{
        
            EntityTransaction tx = getEntityManager().getTransaction();
            tx.begin();
            Query consulta = getEntityManager().createQuery("Select cat from Categoria cat");
            List<Categoria> categorias = consulta.getResultList();
            return categorias;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar as categorias.", e);
        
        }
    }
    
       public Categoria consultarPorId(Categoria cat, Serializable id) {
               cat = null;
		try {
			cat = getEntityManager().find(Categoria.class, id);
                        
		}catch (RuntimeException re){

			re.printStackTrace();
                }
                return cat;
    }
    
    
    
}
