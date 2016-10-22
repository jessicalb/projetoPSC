/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.DAOGenerico;
import Exceção.DAOException;
import model.Cliente;
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
public class ClienteDAO extends DAOGenerico<Cliente> {


    // construtor que faz referencia ao
    public ClienteDAO(EntityManager manager) {
        super(manager);
    }
    
  
    public List<Cliente> listar() throws DAOException {
        try{
        
            EntityTransaction tx = getEntityManager().getTransaction();
            tx.begin();
            Query consulta = getEntityManager().createQuery("Select cli from Cliente cli");
             List<Cliente> clientes = consulta.getResultList();
            return clientes;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os clientes.", e);
        
        }
        
    }
    
    
    public List<Cliente> buscarPorNomeCliente(String nome) throws DAOException{
      EntityTransaction tx = getEntityManager().getTransaction();
      tx.begin();
      Query consulta = getEntityManager().createQuery("Select c from Funcionario c where c.nome = :nome");
      consulta.setParameter("nome", nome);
      List<Cliente> cliente = consulta.getResultList(); 
    
         if(!cliente.isEmpty()){
          return cliente;
         }
         else{
         
          return null;
         }
    
    }
    
 

}
