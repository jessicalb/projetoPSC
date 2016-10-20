/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exceção.DAOException;
import model.Fornecedor;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class FornecedorDAO extends DAOGenerico<Fornecedor> {

     
    
    public FornecedorDAO(EntityManager manager){
        super();
    
       
    }
 
    public List<Fornecedor> listar() throws DAOException {
         try{
        
             EntityTransaction tx = getEntityManager().getTransaction();
             Query consulta = getEntityManager().createQuery("Select for from Fornecedor for");
             List<Fornecedor> fornecedores = consulta.getResultList();
 
        return fornecedores;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os fornecedores.", e);
        
        }
    
    }
    
     public Fornecedor consultarPorId(Fornecedor forn, Serializable id) {
               forn = null;
		try {
			forn = getEntityManager().find(Fornecedor.class, id);
                        
		}catch (RuntimeException re){

			re.printStackTrace();
                }
                return forn;
    }
    
}
 
    
    

