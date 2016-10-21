
package control;

import control.CategoriaDAO;
import control.DAOFactory;

import Exceção.DAOException;
import model.Categoria;
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

    
    public void remover(Categoria cat) throws DAOException {
        if(cat.getId() <= 0){
        
          throw new Error("Categoria não encontrada");
        }
        else{
        dao.excluir(cat);
        }
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

   
    public Categoria consultarPorId(int id) throws DAOException {
        Categoria cat = null;
        
          try{ 
               cat = dao.buscarPorChave(id);
          }catch(Exception e){
             throw new DAOException ("Erro ao buscar categoria por id"  + e.getMessage());
          }
        
        
       return  cat;
    }
    
}
