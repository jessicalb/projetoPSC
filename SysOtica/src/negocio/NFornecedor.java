
package negocio;

import DAO.FornecedorDAO;
import DAO.IfornecedorDAO;
import Exceção.DAOException;
import basica.Fornecedor;
import java.util.List;


public class NFornecedor implements IfornecedorDAO{

    @Override
    public void salvar(Fornecedor f) throws DAOException {
        
        
           if(f.getId().equals("")==true){
 throw new Error("Informar Nome Fantasia");   
       }
       
       if(f.getId()==null){
 throw new Error("O Campo Nome Fantasia não pode ser vazio");   
       }
       
       if(f.getId()< 0){
           throw new Error("O codigo deve ser superior a 0"); 
       }
        
        if(f.getNomeFantasia().trim().equals("")==true){
 throw new Error("Informar Nome Fantasia");   
       }
       
       if(f.getNomeFantasia()==null){
 throw new Error("O Campo Nome Fantasia não pode ser vazio");   
       }
       
       
       if(f.getTelefone().trim().equals("")==true){
          throw new Error("Informar Telefone"); 
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
       
       
       if(f.getCnpj().length()!=18){
            throw new Error("O Cnpj devera ter 18 caracteres"); 
       }
       
       FornecedorDAO dao = new FornecedorDAO();
       dao.salvar(f);
         
    }

    @Override
    public void remover(Fornecedor f) throws DAOException {
       
        if(f.getId()<=0 ){
            throw new Error("O codigo do funcionario deve ser superior a zero");
    }
        FornecedorDAO dao = new FornecedorDAO();
        dao.remover(f);
    }

    @Override
    public void atualizar(Fornecedor f) throws DAOException {
        
        if(f.getId().equals("")==true){
 throw new Error("Informar Nome Fantasia");   
       }
       
       if(f.getId()==null){
 throw new Error("O Campo Nome Fantasia não pode ser vazio");   
       }
       
       if(f.getId()< 0){
           throw new Error("O codigo deve ser superior a 0"); 
       }
        
        if(f.getNomeFantasia().trim().equals("")==true){
 throw new Error("Informar Nome Fantasia");   
       }
       
       if(f.getNomeFantasia()==null){
 throw new Error("O Campo Nome Fantasia não pode ser vazio");   
       }
       
       
       if(f.getTelefone().trim().equals("")==true){
          throw new Error("Informar Telefone"); 
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
       
       
       if(f.getCnpj().length()!=18){
            throw new Error("O Cnpj devera ter 18 caracteres"); 
       }
       
       FornecedorDAO dao = new FornecedorDAO();
       dao.atualizar(f);
    }

    @Override
    public List<Fornecedor> listar() throws DAOException {
    FornecedorDAO dao = new FornecedorDAO();
    return dao.listar();
    }

    @Override
    public Fornecedor consultarPorId(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
