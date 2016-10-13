/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Cliente;
import basica.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class FornecedorDAO implements IfornecedorDAO {

      private EntityManagerFactory emf;
    private EntityManager em;
    
    public FornecedorDAO(){
    
        emf = Persistence.createEntityManagerFactory("hibernatetest");
        em = emf.createEntityManager();
    }
    
    
    
    
    @Override
    public void salvar(Fornecedor f) throws DAOException {
            try{
        
        em.getTransaction().begin();
        em.persist(f);   
        em.getTransaction().commit();
        

        }catch(Exception e){
            em.getTransaction().rollback();
        
           throw new DAOException("Erro ao cadastrar fornecedor", e);
        }
        emf.close();
     
        
    }

    @Override
    public void remover(Fornecedor f) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Fornecedor f) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> listar() throws DAOException {
         try{
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("Select for from Fornecedor for");
        List<Fornecedor> fornecedores = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return fornecedores;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os fornecedores.", e);
        
        }
    }
 
    @Override
    public Fornecedor consultarPorId(Integer id) throws DAOException {
         try{
         
         Fornecedor f = null;
         f = em.find(Fornecedor.class, id);
         emf.close();
         return f;
        
        }catch(Exception e){
          throw new DAOException("Erro ao buscar ao Fornecedor", e);
        }
    }
    
}
