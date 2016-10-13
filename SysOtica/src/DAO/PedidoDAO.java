/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Pedido;
import basica.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class PedidoDAO implements IpedidoDAO{
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public PedidoDAO(){
    
        emf = Persistence.createEntityManagerFactory("hibernatetest");
        em = emf.createEntityManager();
    }

    @Override
    public void salvar(Pedido ped) throws DAOException {
        try{

            em.getTransaction().begin();
            em.persist(ped);   
            em.getTransaction().commit();


            }catch(Exception e){
                em.getTransaction().rollback();

               throw new DAOException("Erro ao cadastrar pedido", e);
            }
            emf.close();
        
        
        
        
        
    }

    @Override
    public void remover(Pedido ped) throws DAOException {
       
    }

    @Override
    public void atualizar(Pedido ped) throws DAOException {
        
    }

    @Override
    public List<Pedido> listar() throws DAOException {
         try{
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("Select p from Pedido p");
        List<Pedido> pedidos = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return pedidos;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os pedidos.", e);
        
        }
        
       
    
    }

    @Override
    public Pedido consultarPorId(Integer id) throws DAOException {
            try{
         
         Pedido p = null;
         p = em.find(Pedido.class, id);
         emf.close();
         return p;
        
        }catch(Exception e){
          throw new DAOException("Erro ao buscar ao Pedido", e);
        }
    
    }
    
    
    
}
