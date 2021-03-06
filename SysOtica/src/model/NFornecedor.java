
package model;


import Exceção.DAOException;
import model.Fornecedor;
import java.util.List;
import model.Funcionario;


public class NFornecedor {

     private FornecedorDAO dao;
    
    public NFornecedor(){
    
      dao = DAOFactory.getFornecedorDAO();
    
    }
    // valida o email atraves do regex
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
            throw new Error("Fornecedor não encotrado");
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

   
    public Fornecedor consultarPorId(int id) throws DAOException {
         Fornecedor f = null;
        
          try{ 
               f = dao.buscarPorChave(id);
          }catch(Exception e){
             throw new DAOException ("Erro ao buscar fornecedor pelo id"  + e.getMessage());
          }
        
        
       return  f;
    
    
    
    
    }
    
    public List<Fornecedor> consultarPorNomeFornecedor(String nome) throws DAOException{
      
       
        
        return dao.buscarPorNomeFornecedor(nome);
        
        
    }
    
}
