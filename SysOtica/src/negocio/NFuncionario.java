
package negocio;

import DAO.FuncionarioDAO;
import DAO.IfuncionarioDAO;
import Exceção.DAOException;
import basica.Funcionario;
import java.util.List;


public class NFuncionario implements IfuncionarioDAO{

    @Override
    public Funcionario salvar(Funcionario f) throws DAOException {
        if(f.getCargo().trim().equals("")==true){
 throw new Error("Informar Cargo");   
       }
       
       if(f.getCargo()==null){
 throw new Error("O Campo Cargo não pode ser vazio");   
       }
       
        if(f.getLogin().trim().equals("")==true){
 throw new Error("Informar Login");   
       }
       
       if(f.getLogin()==null){
 throw new Error("O Campo Login não pode ser vazio");   
       }
       
        if(f.getSenha().trim().equals("")==true){
 throw new Error("Informar Senha");   
       }
       
       if(f.getSenha()==null){
 throw new Error("O Campo Senha não pode ser vazio");   
       }
       
       if(f.getSenha().length()!=6){
          throw new Error("A senha só pode conter 6 caracteres");  
       }
       
       FuncionarioDAO dao = new FuncionarioDAO();
       dao.salvar(f);
       return f;
    }


    @Override
    public Funcionario atualizar(Funcionario f) throws DAOException {
        if(f.getCargo().trim().equals("")==true){
 throw new Error("Informar Cargo");   
       }
       
       if(f.getCargo()==null){
 throw new Error("O Campo Cargo não pode ser vazio");   
       }
       
        if(f.getLogin().trim().equals("")==true){
 throw new Error("Informar Login");   
       }
       
       if(f.getLogin()==null){
 throw new Error("O Campo Login não pode ser vazio");   
       }
       
        if(f.getSenha().trim().equals("")==true){
 throw new Error("Informar Senha");   
       }
       
       if(f.getSenha()==null){
 throw new Error("O Campo Senha não pode ser vazio");   
       }
       
       if(f.getSenha().length()!=6){
          throw new Error("A senha só pode conter 6 caracteres");  
       }
       return f;
    }

    @Override
    public void excluir(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listar() throws DAOException {
        FuncionarioDAO dao = new FuncionarioDAO();
        return dao.listar();
                
    }

    @Override
    public Funcionario consultarPorId(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
