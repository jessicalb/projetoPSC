/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.DAOGenerico;
import Exceção.DAOException;
import model.Categoria;
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
public class CategoriaDAO extends DAOGenerico<Categoria> {

   
    
    public CategoriaDAO(EntityManager manager){
        super(manager);
        
        }
    
  
    public List<Categoria> listar() throws DAOException {
         try{
        
            EntityTransaction tx = getEntityManager().getTransaction();
            tx.begin();
            Query consulta = getEntityManager().createQuery("Select cat from Categoria cat");
            List<Categoria> categorias = consulta.getResultList();
            return categorias;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar as categorias.", e);
        
        }
    }
    
    
    public List<Categoria> buscarPorNomeCategoria(String nome) throws DAOException{
      EntityTransaction tx = getEntityManager().getTransaction();
      tx.begin();
      Query consulta = getEntityManager().createQuery("Select c from Categoria c where c.nome = :nome");
      consulta.setParameter("nome", nome);
      List<Categoria> categoria = consulta.getResultList(); 
    
         if(!categoria.isEmpty()){
          return categoria;
         }
         else{
         
          return null;
         }
    
    }
    
    

    
}
