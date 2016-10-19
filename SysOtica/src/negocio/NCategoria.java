
package negocio;

import DAO.CategoriaDAO;
import DAO.DAOFactory;

import Exceção.DAOException;
import basica.Categoria;
import java.util.List;


public class NCategoria {
    
     
      private CategoriaDAO dao;  
    
    public NCategoria(){
     
        dao = DAOFactory.getCategoriaDAO();
     }

  
    public void salvar(Categoria cat) throws DAOException {
        
         if(cat.getDescricao().trim().equals("")== true){
            throw new Error("Informar Descrição");   
       }
       
        if(cat.getDescricao()== null){
            throw new Error("O Campo Descrição não pode ser vazio");   
       }
       
       
         if(cat.getId().equals("")==true){
          throw new Error("Informar Id"); 
       }
       
       if (cat.getId() < 0) {
            throw new Error("O id tem que ser superior a 0"); 
        }
       
        if(cat.getId()==null){
            throw new Error("O Campo Id não pode ser vazio");   
       }
       
        dao.inserir(cat);
    }

    
    public void remover(Integer id) throws DAOException {
       
        
    }

    
    public void atualizar(Categoria cat) throws DAOException {
        
        if(cat.getId()<= 0 || cat.getId() == null){
          
            throw new Error("O id tem que ser superior a 0");   
       
        }
      
        if(cat.getDescricao().trim().equals("")==true){
            throw new Error("Informar Descrição");   
       }
       
       if(cat.getDescricao()==null){
            throw new Error("O Campo Descrição não pode ser vazio");   
       }

        dao.alterar(cat);
    }

 
    public List<Categoria> listar() throws DAOException {
     
       return dao.listar();
    }

   
    public Categoria consultarPorId(Categoria cat,Integer id) throws DAOException {
      
        
       return  dao.consultarPorId(cat, id);
    }
    
}
