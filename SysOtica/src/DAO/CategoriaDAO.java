/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Categoria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author karlinhos
 */
public class CategoriaDAO implements IcategoriaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;
    
    public CategoriaDAO(){
    
        emf = Persistence.createEntityManagerFactory("hibernatetest");
        em = emf.createEntityManager();
    }
    
    
    @Override
    public void salvar(Categoria cat) throws DAOException {
             try{
        
        em.getTransaction().begin();
        em.persist(cat);   
        em.getTransaction().commit();
        

        }catch(Exception e){
            em.getTransaction().rollback();
        
           throw new DAOException("Erro ao cadastrar cliente", e);
        }
        emf.close();
    }

    @Override
    public void remover(Integer id) throws DAOException {
        
           try {
                       em.getTransaction().begin();
                       Categoria cat = em.find(Categoria.class, id);
                       em.remove(cat);
                       em.getTransaction().commit();
                       emf.close();
           
           }catch(Exception e){
                em.getTransaction().rollback();
               
           }
                       
        
        
        
    }

    @Override
    public void atualizar(Categoria cat) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> listar() throws DAOException {
         try{
        
            em.getTransaction().begin();
            Query consulta = em.createQuery("Select cat from Categoria cat");
            List<Categoria> categorias = consulta.getResultList();
            em.getTransaction().commit();
            emf.close();
            return categorias;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os clientes.", e);
        
        }
    }

    @Override
    public Categoria consultarPorId(Integer id) throws DAOException {
         try{
            Categoria cat = null;
             cat = em.find(Categoria.class, id);
             emf.close();
             return cat;
        
        }catch(Exception e){
          throw new DAOException("Erro ao buscar Cliente", e);
        }
        
    }
    
    
}
