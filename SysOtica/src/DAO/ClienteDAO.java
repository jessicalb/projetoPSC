/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Cliente;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
    
    public Cliente consultarPorId(Cliente cli, Serializable id) {
               cli = null;
		try {
			cli = getEntityManager().find(Cliente.class, id);
                        
		}catch (RuntimeException re){

			re.printStackTrace();
                }
                return cli;
    }

   

    
    
}
