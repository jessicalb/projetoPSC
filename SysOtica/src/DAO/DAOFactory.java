/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author karlinhos
 */
public class DAOFactory {
    
    	private static EntityManager manager;
	private static final EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("hibernatetest");
		if (manager == null || !manager.isOpen()) {
			manager = factory.createEntityManager();
		}
	}
	
	public static ClienteDAO getAlunoDAO(){
		ClienteDAO cliDAO = new ClienteDAO(manager);
		return cliDAO;
	}
    
       
         public static FuncionarioDAO getFuncionarioDAO(){
            FuncionarioDAO fDAO = new FuncionarioDAO(manager);
            return fDAO;
            
        }
         
         public static CategoriaDAO getCategoriaDAO(){
             CategoriaDAO catDAO = new CategoriaDAO(manager);
             return catDAO;
         }
         
         
           public static FornecedorDAO getFornecedorDAO(){
             FornecedorDAO fornDAO = new FornecedorDAO(manager);
             return fornDAO;
         }
           
          public static ProdutoDAO getProdutoDAO(){
            ProdutoDAO pDAO = new ProdutoDAO(manager);
            return pDAO;
          
          } 
          
           public static ReceitaDAO getReceitaDAO(){
            ReceitaDAO recDAO = new ReceitaDAO(manager);
            return recDAO;
          
          } 
           
            public static PedidoDAO getPedidoDAO(){
            PedidoDAO pedDAO = new PedidoDAO(manager);
            return pedDAO;
          
          } 
         

}
