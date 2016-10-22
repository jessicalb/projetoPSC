/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceção.DAOException;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction; 
import javax.persistence.PersistenceException;
import javax.persistence.Query;


/**
 *
 * @author karlinhos
 */
public abstract class DAOGenerico<T>  {
    
    private EntityManager em;
    private Class classePersistente;

   

   
    
    
  
 /**
  * Contrutor que guarda o tipo atual da classe T.
  */
            public DAOGenerico(EntityManager entity) {
                this.setEntityManager(entity);
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();  
	        classePersistente = (Class<T>) parameterizedType.getActualTypeArguments()[0];      
                
            }

                //public DAOGenerico(EntityManager manager){
                 // this.setEntityManager(manager);
               // }

// this.classePersistente = (Class) ((ParameterizedType) getClass()
                 //  .getGenericSuperclass()).getActualTypeArguments()[0];
                
    
  
    private void setEntityManager(EntityManager entityManager) {
       this.em = entityManager;
    }

    public EntityManager getEntityManager(){
     return em;
    }
      /**
	 * Busca a classe persistente do objeto utilizado na classe.
	 * 
	 * @return classe persistente
	 */
   
     protected final Class<T> getClassePersistente() {
		return classePersistente;
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
			getEntityManager().persist(t);
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
		t = getEntityManager().merge(t);
		tx.commit();
		         System.out.println("Alterado com sucesso");
		return  t;
       }catch(Exception e)
       {
         throw new DAOException("Erro ao alterar cliente", e);
       }
        
    }

    
    public void excluir(T t) throws DAOException {
        
        
        try{
              EntityTransaction tx = getEntityManager().getTransaction();
                tx.begin();
		
                //Este merge foi incluido para permitir a exclusao de objetos no estado Detached
                t = getEntityManager().merge(t);
                
                getEntityManager().remove(t);
                tx.commit();
                System.out.println(" removido com sucesso");
        }catch(Exception e){
               throw new DAOException("erro ao excluir ", e);
            }
        
    }
                //inserir colecao de objetos
        public final void inserirColecao(Collection<T> colecao) throws DAOException {
		try {
			EntityTransaction tx = getEntityManager().getTransaction();
			tx.begin();
			for (T t : colecao) {
				getEntityManager().persist(t);	
			}
			
			tx.commit();
			
			System.out.println(classePersistente.getSimpleName() + " salvos com sucesso: " + colecao.size());
		} catch (Exception e) {
			throw new DAOException("Erro ao inserir coleção", e);
		}
	}
    
        
    
        
    
    /**
	 * Busca o objeto uma vez passado sua chave como parâmetro.
	 * 
	 * @param id
	 *            identificador
	 * @return Objeto do tipo T
         */
 	public final T buscarPorChave(Serializable chave) {
		
             T instance = null;
		
                try {
                    
			instance = (T) getEntityManager().find(getClassePersistente(), chave);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
        
		return instance;
	}
    
        
    
    	public final void refresh(T object) {
		getEntityManager().refresh(object);
	}
    
    


    
}
