/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceção.DAOException;
import model.Fornecedor;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import model.Funcionario;

/**
 *
 * @author karlinhos
 */
public class FornecedorDAO extends DAOGenerico<Fornecedor> {

     
    
    public FornecedorDAO(EntityManager manager){
        super(manager);
    
       
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
    
    public List<Fornecedor> buscarPorNomeFornecedor(String nome) throws DAOException{
      EntityTransaction tx = getEntityManager().getTransaction();
      tx.begin();
      Query consulta = getEntityManager().createQuery("Select fo from Fornecedor fo where fo.nome = :nome");
      consulta.setParameter("nome", nome);
      List<Fornecedor> fornecedor = consulta.getResultList(); 
    
         if(!fornecedor.isEmpty()){
          return fornecedor;
         }
         else{
         
          return null;
         }
    
    }
    
 
    
}
 
    
    

