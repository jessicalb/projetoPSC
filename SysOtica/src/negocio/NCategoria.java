
package negocio;

import DAO.CategoriaDAO;
import DAO.IcategoriaDAO;
import Exceção.DAOException;
import basica.Categoria;
import java.util.List;


public class NCategoria implements IcategoriaDAO{

    @Override
    public void salvar(Categoria cat) throws DAOException {
        
         if(cat.getDescricao().trim().equals("")==true){
 throw new Error("Informar Descrição");   
       }
       
       if(cat.getDescricao()==null){
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
        CategoriaDAO dao = new CategoriaDAO();
        dao.salvar(cat);
    }

    @Override
    public void remover(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Categoria cat) throws DAOException {
        if(cat.getDescricao().trim().equals("")==true){
 throw new Error("Informar Descrição");   
       }
       
       if(cat.getDescricao()==null){
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
        CategoriaDAO dao = new CategoriaDAO();
        dao.atualizar(cat);
    }

    @Override
    public List<Categoria> listar() throws DAOException {
       CategoriaDAO dao = new CategoriaDAO();
       return dao.listar();
    }

    @Override
    public Categoria consultarPorId(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
