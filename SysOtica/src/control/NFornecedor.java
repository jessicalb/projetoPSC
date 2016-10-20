
package control;

import control.DAOFactory;
import control.FornecedorDAO;

import Exceção.DAOException;
import model.Fornecedor;
import java.util.List;


public class NFornecedor {

     private FornecedorDAO dao;
    
    public NFornecedor(){
    
      dao = DAOFactory.getFornecedorDAO();
    
    }
    String emails = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$";
   
    public void salvar(Fornecedor f) throws DAOException {
        
     
        if(f.getNomeFantasia().trim().equals("")==true){
             throw new Error("Informar Nome Fantasia");   
       }
       
       if(f.getNomeFantasia()==null){
            throw new Error("O Campo Nome Fantasia não pode ser vazio");   
       }
       
       
       if(f.getTelefone().trim().equals("")==true){
          throw new Error("Informar Telefone"); 
       }
       
       if(f.getTelefone().length() < 10){
           throw new Error("Numero de telefone inválido"); 
       }
    
      
       if(f.getTelefone()==null){
          throw new Error("O campo Telefone não pode ser vazio"); 
       }
       
       if(f.getEmail().trim().equals("")==true){
          throw new Error("Informar Email"); 
       }
       
       if(f.getEmail()==null){
          throw new Error("O campo Email não pode ser vazio"); 
       }
       
       if(!f.getEmail().matches(emails)){
          throw new Error("Email incorreto!");   
       }
           
       
       if(f.getNomeRepresentante().trim().equals("")==true){
          throw new Error("Informar Nome Representante"); 
       }
       
       if(f.getNomeRepresentante()==null){
          throw new Error("O campo nome do representante não pode ser vazio"); 
       }
       
        if(f.getCnpj().trim().equals("")==true){
          throw new Error("Informar Cnpj Representante"); 
       }
       
       if(f.getNomeRepresentante()==null){
          throw new Error("O campo Cnpj não pode ser vazio"); 
       }
       
       
       if(f.getCnpj().length()!=14){
            throw new Error("O Cnpj devera ter 14 caracteres"); 
       }
       
       
       dao.inserir(f);
         
    }

    
    public void remover(Fornecedor f) throws DAOException {
       
        if(f.getId()<=0 ){
            throw new Error("O codigo do funcionario deve ser superior a zero");
    }
        
        dao.excluir(f);
    }

    
    public void atualizar(Fornecedor f) throws DAOException {
        
      

       if(f.getId()< 0){
           throw new Error("O codigo deve ser superior a 0"); 
       }
        
        if(f.getNomeFantasia().trim().equals("")==true){
            throw new Error("Informar Nome Fantasia");   
       }
       
       if(f.getNomeFantasia()==null){
            throw new Error("O Campo Nome Fantasia não pode ser vazio");   
       }
       
       
      if(f.getTelefone().length() < 10){
           throw new Error("Numero de telefone inválido"); 
       }
    
      
       if(f.getTelefone()==null){
          throw new Error("O campo Telefone não pode ser vazio"); 
       }
       
       if(f.getEmail().trim().equals("")==true){
          throw new Error("Informar Email"); 
       }
       
       if(f.getEmail()==null){
          throw new Error("O campo Email não pode ser vazio"); 
       }
       
       if(!f.getEmail().matches(emails)){
          throw new Error("Email incorreto!");   
       
       }
       
       if(f.getNomeRepresentante().trim().equals("")==true){
          throw new Error("Informar Nome Representante"); 
       }
       
       if(f.getNomeRepresentante()==null){
          throw new Error("O campo nome do representante não pode ser vazio"); 
       }
       
        if(f.getCnpj().trim().equals("")==true){
          throw new Error("Informar Cnpj Representante"); 
       }
       
       if(f.getNomeRepresentante()==null){
          throw new Error("O campo Cnpj não pode ser vazio"); 
       }
       
       
       if(f.getCnpj().length()!=14){
            throw new Error("O Cnpj devera ter 14 caracteres"); 
       }
        dao.alterar(f);
       
    }

   
    public List<Fornecedor> listar() throws DAOException {
   
    return dao.listar();
    }

   
    public Fornecedor consultarPorId(Fornecedor f,Integer id) throws DAOException {
        
    return dao.consultarPorId(f, id);
    
    
    
    }
    
}
