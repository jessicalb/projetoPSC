
package control;

import control.DAOFactory;
import control.FuncionarioDAO;
import Exceção.DAOException;
import model.Funcionario;
import java.io.Serializable;
import java.util.List;


public class NFuncionario {
       
       
      private FuncionarioDAO fdao;  
    
       public NFuncionario(){
            fdao = DAOFactory.getFuncionarioDAO();
            
        }
        
    
    public Funcionario salvar(Funcionario f) throws DAOException {
        if(f.getCargo().trim().equals("")==true){
                throw new Error("Informar Cargo");   
       }
       
       if(f.getCargo()==null){
            throw new Error("O Campo Cargo não pode ser vazio");   
       }
       
       /* if(f.getLogin().trim().equals("")==true){
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
       }*/
       
       this.fdao.inserir(f);
       return f;
      
      
    }
        

    
    public Funcionario atualizar(Funcionario f) throws DAOException {
       /* if(f.getCargo().trim().equals("")==true){
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
       }*/
       
       fdao.alterar(f);
       return f;
    }

    
    public void excluir(Funcionario f) throws DAOException {
       fdao.excluir(f);
    }

    
    public List<Funcionario> listar() throws DAOException {
    
        return fdao.listar();
                
    }

  
    public Funcionario consultarPorId (Funcionario f, Serializable id) throws DAOException {
        
 
        return fdao.consultarPorId(f, id);
           
    }
    
}
