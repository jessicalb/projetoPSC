/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Receita;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class ReceitaDAO implements IreceitaDAO {

      EntityManagerFactory emf;
      EntityManager em;
    
       public ReceitaDAO(){
    
        emf = Persistence.createEntityManagerFactory("hibernatetest");
        em = emf.createEntityManager();
    }
    
    @Override
    public void salvar(Receita r) throws DAOException {
        
          try{
        
        em.getTransaction().begin();
        em.persist(r);   
        em.getTransaction().commit();
        

        }catch(Exception e){
            em.getTransaction().rollback();
        
           throw new DAOException("Erro ao cadastrar receita", e);
        }
        emf.close();
        
        
        
       
    }

    @Override
    public void remover(Integer id) throws DAOException {
            try {
                       em.getTransaction().begin();
                       Receita r = em.find(Receita.class, id);
                       em.remove(r);
                       em.getTransaction().commit();
                       emf.close();
           
           }catch(Exception e){
                em.getTransaction().rollback();
               
           }
    }

    @Override
    public void atualizar(Receita r) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Receita> listar() throws DAOException {
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery("from Receita r");
            List<Receita> receitas = consulta.getResultList();
            em.getTransaction().commit();
            emf.close();
            return receitas;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar  receitas.", e);
        
        }
        
    }

    @Override
    public Receita consultarPorId(Integer id) throws DAOException {
         try{
         
         Receita r = null;
         r = em.find(Receita.class, id);
         emf.close();
         return r;
        
        }catch(Exception e){
          throw new DAOException("Erro ao buscar Receita", e);
        }
        
    }
    
}
