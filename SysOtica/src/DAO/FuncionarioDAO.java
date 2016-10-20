/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Funcionario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class FuncionarioDAO extends DAOGenerico<Funcionario> {
    
  
    
    public FuncionarioDAO(EntityManager manager){
       super();
     
    }

  

  
    public List<Funcionario> listar() throws DAOException {
        try{
        
            EntityTransaction tx = getEntityManager().getTransaction();
            tx.begin();
            Query consulta = getEntityManager().createQuery("Select f from Funcionario f");
            List<Funcionario> funcionarios = consulta.getResultList();
 
        return funcionarios;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os clientes.", e);
        
        }
        
    }

   
    public Funcionario consultarPorId(Funcionario f, Serializable id) {
               f = null;
		try {
			f = getEntityManager().find(Funcionario.class, id);
                        
		}catch (RuntimeException re){

			re.printStackTrace();
                }
                return f;
    }

    

   
    
}
