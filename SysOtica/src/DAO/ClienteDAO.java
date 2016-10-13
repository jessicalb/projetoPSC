/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class ClienteDAO implements IClienteDAO{

    private EntityManagerFactory emf;
    private EntityManager em;
    
    public ClienteDAO(){
    
        emf = Persistence.createEntityManagerFactory("hibernatetest");
        em = emf.createEntityManager();
    }
    
    
    @Override
    public void salvar(Cliente cli) throws DAOException {
        
        em.getTransaction().begin();
        try{
            if(cli.getId() == null){
                em.persist(cli);
                }else {
                        if(!em.contains(cli)){
                            if(em.find(Cliente.class, cli.getId()) == null){

                        throw new Exception("Erro ao atualizar");
                        }
                    }   
        
                cli = em.merge(cli);
            }
            em.getTransaction().commit();
            emf.close();
    
            }catch(Exception e){
                throw new DAOException("Erro ao cadastrar cliente.", e);
                
            }
        
    }
    
     
   

    @Override
    public void remover(Integer id) throws DAOException {
       
       try {
                       
                       Query string = em.createQuery("Delete from Cliente where cliente_id = :id ");
                       string.setParameter("cliente_id", id);
                       em.getTransaction().begin();
                       em.remove(string);
                       em.getTransaction().commit();
                       emf.close();
           
           }catch(Exception e){
                em.getTransaction().rollback();
               
           }
    }

    @Override
    public List<Cliente> listar() throws DAOException {
        try{
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("Select cli from Cliente cli");
        List<Cliente> clientes = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return clientes;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os clientes.", e);
        
        }
        
    }

    @Override
    public Cliente consultarPorId(Integer id) throws DAOException {
           try{
         
         Cliente cli = null;
         cli = em.find(Cliente.class, id);
         emf.close();
         return cli;
        
        }catch(Exception e){
          throw new DAOException("Erro ao buscar Cliente", e);
        }
        
                 
           
    }

    @Override
    public void atualizar(Cliente cli) throws DAOException {
         try{
        
            em.getTransaction().begin();
            if(cli.getId() != null){
              em.merge(cli);   
            }
            
            em.getTransaction().commit();
        

        }catch(Exception e){
            em.getTransaction().rollback();
        
           throw new DAOException("Erro ao atualizar cliente", e);
        }
        emf.close();
        
    }
    
}
