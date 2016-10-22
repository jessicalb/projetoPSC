/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.DAOGenerico;
import Exceção.DAOException;
import model.Produto;
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
public class ProdutoDAO extends DAOGenerico<Produto> {

    
  
    
    public ProdutoDAO(EntityManager manager){
       super(manager);
        
    }
    
  
    public List<Produto> listar() throws DAOException {
         try{
        
        EntityTransaction  tx = getEntityManager().getTransaction();
        Query consulta = getEntityManager().createQuery("Select p from Produto p");
        List<Produto> produtos = consulta.getResultList();
       
        return produtos;
        
        }catch(Exception e){
            throw new DAOException("Erro ao listar os produtos.", e);
        
        }
    }
    
    public List<Produto> buscarPorNomeProduto(String nome) throws DAOException{
      EntityTransaction tx = getEntityManager().getTransaction();
      tx.begin();
      Query consulta = getEntityManager().createQuery("Select prod from Produto prod where prod.nome = :nome");
      consulta.setParameter("nome", nome);
      List<Produto> produto = consulta.getResultList(); 
    
         if(!produto.isEmpty()){
          return produto;
         }
         else{
         
          return null;
         }
    
    }
        
   
}
