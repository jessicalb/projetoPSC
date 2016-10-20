/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exceção.DAOException;
import model.Receita;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class ReceitaDAO extends DAOGenerico<Receita> {

     
    
       public ReceitaDAO(EntityManager manager){
            super(manager);
       
    }
    

    public List<Receita> listar() throws DAOException {
        try{
            
            EntityTransaction tx = getEntityManager().getTransaction();
            Query consulta = getEntityManager().createQuery("from Receita r");
            List<Receita> receitas = consulta.getResultList();
            return receitas;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar  receitas.", e);
        
        }
        
    }

           public Receita consultarPorId(Receita r, Serializable id) {
               r = null;
		try {
			r = getEntityManager().find(Receita.class, id);
                        
		}catch (RuntimeException re){

			re.printStackTrace();
                }
                return r;
            }
         
  
    
}
