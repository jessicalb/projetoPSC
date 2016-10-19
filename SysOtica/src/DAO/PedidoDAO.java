/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Pedido;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import javax.persistence.Query;

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
        
           public Pedido consultarPorId(Pedido ped, Serializable id) {
               ped = null;
		try {
			ped = getEntityManager().find(Pedido.class, id);
                        
		}catch (RuntimeException re){

			re.printStackTrace();
                }
                return ped;
            }
         
       
    
    }

   
    
    
    

