/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
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
public class ProdutoDAO implements IprodutoDAO{

    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public ProdutoDAO(){
    
        emf = Persistence.createEntityManagerFactory("hibernatetest");
        em = emf.createEntityManager();
    }
    
    
    
    
    @Override
    public void salvar(Produto p) throws DAOException {
          try{

            em.getTransaction().begin();
            em.persist(p);   
            em.getTransaction().commit();


            }catch(Exception e){
                em.getTransaction().rollback();

               throw new DAOException("Erro ao cadastrar fornecedor", e);
            }
            emf.close();
        
        
        
    }

    @Override
    public void remover(Produto p) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Produto p) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> listar() throws DAOException {
         try{
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("Select p from Produto p");
        List<Produto> produtos = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return produtos;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os produtos.", e);
        
        }
    }

    @Override
    public Produto consultarPorId(Integer id) throws DAOException {
          try{
         
         Produto p = null;
         p = em.find(Produto.class, id);
         emf.close();
         return p;
        
        }catch(Exception e){
          throw new DAOException("Erro ao buscar ao Produto", e);
        }
    }
    
    
    
}
