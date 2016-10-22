/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceção.DAOException;
import model.Pedido;
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
public class PedidoDAO extends DAOGenerico<Pedido>{
    

    
    public PedidoDAO(EntityManager manager){
         super(manager);
  
    }

    
    public List<Pedido> listar() throws DAOException {
         try{
        
                EntityTransaction tx = getEntityManager().getTransaction();
                Query consulta = getEntityManager().createQuery("Select p from Pedido p");
                List<Pedido> pedidos = consulta.getResultList();
                return pedidos;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os pedidos.", e);
        
        }
         
     }
    
    public List<Pedido> buscarPorNomePedido(String nome) throws DAOException{
      EntityTransaction tx = getEntityManager().getTransaction();
      tx.begin();
      Query consulta = getEntityManager().createQuery("Select p from Pedido p where p.nome = :nome");
      consulta.setParameter("nome", nome);
      List<Pedido> pedido = consulta.getResultList(); 
    
         if(!pedido.isEmpty()){
          return pedido;
         }
         else{
         
          return null;
         }
    
    }
        
     
       
    
    }

   
    
    
    

