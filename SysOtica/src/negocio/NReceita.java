/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import DAO.DAOFactory;
import DAO.ReceitaDAO;
import Exceção.DAOException;
import basica.Receita;

/**
 *
 * @author Joanna
 */
public class NReceita {
    
    
     private ReceitaDAO dao;
     
     public NReceita() {
    
         dao = DAOFactory.getReceitaDAO();
        
    }
     
     public void salvar(Receita r) throws DAOException{
     
      if(r.getCliente().getId()== null || r.getCliente().getId() <=0){
        throw new Error("Não é possivel inserir uma receita sem cliente cadastrado");
      }
         
      if(r.getRc_nomemedico() == null || r.getRc_nomemedico().equals("")){
          throw new Error("Campo nome do médico não pode ser vazio");
      }
      
         
     
     }
     
    
}
