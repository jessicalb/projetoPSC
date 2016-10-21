/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exceção.DAOException;
import model.Funcionario;
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
       super(manager);
     
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
    
      public List<Funcionario> buscarPorNome(String nome) throws DAOException{
      EntityTransaction tx = getEntityManager().getTransaction();
      tx.begin();
      Query consulta = getEntityManager().createQuery("Select f from Funcionario f where f.nome = :nome");
      consulta.setParameter("nome", nome);
      List<Funcionario> funcionarios = consulta.getResultList(); 
    
         if(!funcionarios.isEmpty()){
          return funcionarios;
         }
         else{
         
          return null;
         }
    
    }


}
