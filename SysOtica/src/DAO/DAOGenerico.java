/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.EntidadeBase;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction; 
import javax.persistence.Query;


/**
 *
 * @author karlinhos
 */
public class DAOGenerico<T extends EntidadeBase>  {
    
    private EntityManager em;
   

    public DAOGenerico(EntityManager em){
        this.setEntityManager(em);
     
    }

    private void setEntityManager(EntityManager em) {
       this.em = em;
    }

    public EntityManager getEntityManager(){
     return em;
    }
    /**
	 * Salva o objeto atual na base de dados.
	 * 
	 * @param objeto a ser salvo
	 */

       public void inserir(T t) throws DAOException {
       EntityTransaction tx = getEntityManager().getTransaction();		
		try {
			tx.begin();
                        if(t.getId() == null){
			getEntityManager().persist(t);
                        }
			tx.commit();
			System.out.println(" salvo com sucesso");
		} catch (Exception e) {
                           throw new DAOException("Erro ao inserir no bando de dados", e);
		}
    }
/**
	 * Executa o merge do objeto que se encontra em memória.
	 * 
	 * @param objeto
	 *            a ser realizado o merge
	 * @return objeto que foi executado o merge
	 */
    
    
    
    public Object alterar(T t) throws DAOException {
        
       try{ 
        EntityTransaction tx = getEntityManager().getTransaction();
		tx.begin();
		if(t.getId() != null){
		t = getEntityManager().merge(t);
                }
		tx.commit();
		         System.err.println("Alterado com sucesso");
		return  t;
       }catch(Exception e)
       {
         throw new DAOException("Erro ao alterar cliente");
       }
        
    }

    
    public void excluir(Class<T> classe, Serializable id) throws DAOException {
        
        
        try{
        EntityTransaction tx = getEntityManager().getTransaction();
		T t = getEntityManager().find(classe, id);
                tx.begin();
		getEntityManager().remove(t);

                tx.commit();
                System.out.println(" removido com sucesso");
        }catch(Exception e){
               throw new DAOException("erro ao excluir ", e);
            }
        
    }
        
    

    /**
	 * Busca o objeto uma vez passado sua chave como parâmetro.
	 * 
	 * @param id
	 *            identificador
	 * @return Objeto do tipo T
         */
    public T consultarPorId(Class<T> classe, Serializable id) throws DAOException {

                     T tipo = null;
		try {
			tipo = (T) getEntityManager().find(classe, id);
                        return tipo;
		}catch (Exception e){
                      throw new DAOException("Erro ao buscar Cliente", e);
                }
      
    }
    
    


    
}
