/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Funcionario;
import basica.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class FuncionarioDAO implements IfuncionarioDAO {
    
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public FuncionarioDAO(){
    
        emf = Persistence.createEntityManagerFactory("hibernatetest");
        em = emf.createEntityManager();
    }
    
    
    
    @Override
    public Funcionario salvar(Funcionario f) throws DAOException {
    
        try{
            em.getTransaction().begin();
   
    if(f.getId() == null){
    em.persist(f);
    }else {
        if(!em.contains(f)){
            if(em.find(Funcionario.class, f.getId()) == null){
            
            throw new Exception("Erro ao atualizar");
            }
        }
        f = em.merge(f);
    }
    em.getTransaction().commit();
    emf.close();
    
            }catch(Exception e){
                throw new DAOException("Erro ao cadastrar usuario no banco.", e);
                
            }
        return f;
    }
    
     
    
    
    
    @Override
    public Funcionario atualizar(Funcionario f) throws DAOException {
           try{
    em.getTransaction().begin();
   
    if(f.getId() != null){
    em.merge(f);
    }
    em.getTransaction().commit();
    emf.close();
    
            }catch(Exception e){
                throw new DAOException("Erro ao alterar usuario no banco.", e);
                
            }
           return f;
    }
    
        
        
        

    @Override
    public void excluir(Integer id) throws DAOException {
    
              try {
                       Funcionario f = em.find(Funcionario.class,id);
                       em.getTransaction().begin();
                       em.remove(f);
                       em.getTransaction().commit();
                       emf.close();
           
           }catch(Exception e){
                em.getTransaction().rollback();
               
           }
    
        
        
    }

    @Override
    public List<Funcionario> listar() throws DAOException{
        
        try{
        
        em.getTransaction().begin();
        Query consulta = em.createQuery("Select f from Funcionario f");
        List<Funcionario> funcionarios = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return funcionarios;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar.", e);
        
        }
        
    }

    @Override
    public Funcionario consultarPorId(Integer id) throws DAOException {
         
        try{
         
         Funcionario f = null;
         f = em.find(Funcionario.class, id);
         emf.close();
         return f;
        
        }catch(Exception e){
          throw new DAOException("Erro ao buscar Funcionario", e);
        }
        
                 
    }
    
}
